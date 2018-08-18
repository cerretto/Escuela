package ar.com.escuela.security;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtTokenFilter extends GenericFilterBean {

    private JwtTokenProvider jwtTokenProvider;

    public JwtTokenFilter(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain)
            throws IOException, ServletException {
        try {
            jwtTokenProvider.authenticate((HttpServletRequest) req);
        } catch (AuthenticationException ex) {  // <-- esto es una re negrada
            HttpServletResponse response = (HttpServletResponse) res;
            response.sendError(HttpStatus.UNAUTHORIZED.value(), ex.getMessage());
            return;
        }

        filterChain.doFilter(req, res);
    }

}
