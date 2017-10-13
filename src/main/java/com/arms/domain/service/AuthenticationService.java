package com.arms.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.arms.domain.entity.User;
import com.arms.domain.repository.UserRepository;

@Service
public class AuthenticationService implements UserDetailsService{

	@Autowired
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = repository.findByEmail(email);
		if(user == null){
			return null;
		}
		MyUserDetailsImpl myUserDetailsImpl = new MyUserDetailsImpl(user);
/*		myUserDetailsImpl.setAccountNonExpired(true);
		myUserDetailsImpl.setAccountNonLocked(true);
		myUserDetailsImpl.setCredentialsNonExpired(true);
		myUserDetailsImpl.setEnabled(true);*/
		return myUserDetailsImpl;
	}
	
	
}
