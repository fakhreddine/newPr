package gestionreservation.spring.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import gestionreservation.spring.model.Role;
import gestionreservation.spring.model.Utilisateur;
import gestionreservation.spring.security.MD5;
import gestionreservation.spring.service.UtilisateurServiceImpl;

//import com.kb.model.CustomUser;
//import com.kb.service.CustomutilisateurService;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private UserDetailsService utilisateurServiceImpl;

	public UserDetailsService getUtilisateurServiceImpl() {
		return utilisateurServiceImpl;
	}

	public void setUtilisateurServiceImpl(UserDetailsService utilisateurServiceImpl) {
		this.utilisateurServiceImpl = utilisateurServiceImpl;
	}

	public Authentication authenticate(Authentication authentication) throws AuthenticationException{

		String username = "";
		username = authentication.getName();
		String password = "";
		Collection<? extends GrantedAuthority> authorities =new ArrayList<Role>();
		authorities.add(null);

		UserDetails user = utilisateurServiceImpl.loadUserByUsername(username);
		try {
			password = MD5.tomd5((String) authentication.getCredentials());
		} catch (Exception e) {
			e.printStackTrace();
		}
			if (user == null || !user.getUsername().equalsIgnoreCase(username)) {
				throw new BadCredentialsException("Username not found.");
			}

			if (!password.equals(user.getPassword())) {
				throw new BadCredentialsException("Wrong password.");
			}

			authorities = user.getAuthorities();
		
		return new UsernamePasswordAuthenticationToken(user, password, authorities);

	}

	public boolean supports(Class<?> arg0) {
		return true;
	}

}
