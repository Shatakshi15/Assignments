package com.shatakshi.spring.Services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.shatakshi.spring.entity.Content;
import com.shatakshi.spring.entity.UserDetail;

@Service
public interface ContentService {
	public UserDetail createAccount(UserDetail user);
    
	public UserDetail fetchEmail(String email);
	public UserDetail getUsers(String username);
	
public List<Content> searchItemByCategory(String item);
public List<Content> searchItemByMerchant(String item);
}
