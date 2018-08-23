package ar.com.escuela.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ar.com.escuela.seg.bean.Usuario;
import ar.com.escuela.seg.service.SeguridadService;

@Service
public class MyUserDetails implements UserDetailsService {

	@Autowired
	private SeguridadService seguridadService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		final Usuario user = seguridadService.getUsuarioByUserName(username);

		if (user == null) {
			throw new UsernameNotFoundException("User '" + username + "' not found");
		}

		List<String> rolesList = new ArrayList<>();
		user.getUsuarioRoles().stream().filter(x -> x != null).forEach(x -> {
			rolesList.add(x.getRol().getCodigo());
		});
		String[] arrayRoles = rolesList.toArray(new String[0]);

		return org.springframework.security.core.userdetails.User//
				.withUsername(username)//
				.password(user.getPassword())//
				.authorities(arrayRoles)//
				.accountExpired(false)//
				.accountLocked(false)//
				.credentialsExpired(false)//
				.disabled(false)//
				.build();
	}

}
