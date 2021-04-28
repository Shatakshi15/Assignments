package com.shatakshi.spring.Services;

import org.springframework.stereotype.Service;

import com.shatakshi.spring.entity.UserDetail;
@Service
public interface UserService {
	
		public UserDetail openAccount(String email, String password);
	

}
