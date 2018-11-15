package ar.com.escuela.security;

import ar.com.escuela.seg.bean.Rol;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.security.Key;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class JwtTokenProvider {

    /**
     * THIS IS NOT A SECURE PRACTICE! For simplicity, we are storing a static key
     * here. Ideally, in a microservices environment, this key would be kept on a
     * config-server.
     */
//    @Value("${security.jwt.token.secret-key:secret-key}") //TODO: not used
//    private String secretKey;

    @Value("${security.jwt.token.expire-length}")
    private long validityInMilliseconds;

    @Autowired
    private MyUserDetails myUserDetails;

//    @PostConstruct
//    protected void init() {
//        secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
//    } //TODO: not used

    private Key secretKey;

    @PostConstruct
    protected void init() {
        secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    } //TODO: not used

    /**
     * Creates the token with the username and a list of roles of the user, and
     * returns it.
     */
    public String createToken(String username, List<Rol> roles) {

        Claims claims = Jwts.claims().setSubject(username);
        List<GrantedAuthority> listGrantedRoles = roles.stream().map(s -> new SimpleGrantedAuthority(s.getCodigo()))
                .filter(Objects::nonNull).collect(Collectors.toList());

        claims.put("auth", listGrantedRoles);

        Date now = new Date();
        Date validity = new Date(now.getTime() + validityInMilliseconds);

        return Jwts.builder()//
                .setClaims(claims)//
                .setIssuedAt(now)//
                .setExpiration(validity)//
                .signWith(secretKey)//
                .compact();
    }

    /**
     * Method to be call on every request by the web filter JwtTokenFilter
     */
    public void authenticate(HttpServletRequest req) {

        String token = this.resolveToken((HttpServletRequest) req);

        if (this.validateToken(token)) {

            Authentication auth = this.getAuthentication(token);

            SecurityContextHolder.getContext().setAuthentication(auth);
        }
    }

    /**
     * Returns a standard Authentication object, filled with the authenticated user
     * data, recovered from the database
     */
    public Authentication getAuthentication(String token) {
        UserDetails userDetails = myUserDetails.loadUserByUsername(getUsername(token));
        return new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
    }

    /**
     * Extracts the username from the token, using the secret key as part of the
     * decoding process.
     *
     * @param token
     * @return
     */
    public String getUsername(String token) {
        return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody().getSubject();
    }

    /**
     * Recover the token from the 'Authorization' header. <br>
     * Returns null if the 'Authorization' header is empty, or if it doesnt start
     * with 'Bearer '
     */
    public String resolveToken(HttpServletRequest req) {
        String bearerToken = req.getHeader("Authorization");
        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7, bearerToken.length());
        }
        return null;
    }

    /**
     * Returns true if Token is valid. <br>
     * Checks against the secret key and expired time
     */
    public boolean validateToken(String token) {

        if (StringUtils.isEmpty(token))
            return false;

        try {
            Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            throw new BadCredentialsException("Expired or invalid JWT token");
        }
    }

}
