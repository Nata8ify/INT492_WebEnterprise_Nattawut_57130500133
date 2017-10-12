package com.arms.domain.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.arms.domain.entity.Role;
import com.arms.domain.entity.User;

public class MyUserDetailsImpl implements UserDetails{

	private User user;
	private Set<GrantedAuthority> authority;
	
	
	public MyUserDetailsImpl(User user) {
		super();
		this.user = user;
		authority = new HashSet<>();
		for(Role role : user.getRoles()){
			authority.add(new SimpleGrantedAuthority(role.getRoleName()));
		}
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authority;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
