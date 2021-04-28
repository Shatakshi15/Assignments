package com.shatakshi.spring.entity;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails{
	
	UserDetail user;

	/**
	 * 
	 */
	private static final long serialVersionUID = -5418145562834129090L;
	String password;
	String username;
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return (Collections.singleton(new SimpleGrantedAuthority("USER")));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUsername();
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
	public static UserDetailsImpl build(UserDetail user) {

		return (new UserDetailsImpl(
				user.getUsername(), 
				user.getPassword()));
	}

	
	public UserDetailsImpl(UserDetail user) {

		this.user=user;
	}

	public UserDetailsImpl(String password, String username) {
		super();
		this.password = password;
		this.username = username;
	}

}
