package com.shatakshi.spring.Services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.shatakshi.spring.Repository.UserRepository;
import com.shatakshi.spring.entity.UserDetail;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userrepo;
	public UserDetail openAccount(String email, String password)
	{
		return(userrepo.findByUsernameAndPassword(email,password));
	}
	
	

}
