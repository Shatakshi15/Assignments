package com.shatakshi.spring.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shatakshi.spring.Repository.ContentRepository;
import com.shatakshi.spring.Repository.DetailsRepository;
import com.shatakshi.spring.entity.Content;
import com.shatakshi.spring.entity.UserDetail;

@Service
public class ContentServiceImpl implements ContentService{
	
	@Autowired
	private ContentRepository contentRepo;
	
	@Autowired
	private DetailsRepository detailrepo;
	@Override
	public UserDetail createAccount(UserDetail user)
	{
		return(detailrepo.insert(user));
	}

	@Override
	public UserDetail fetchEmail(String email)
	{
		return(detailrepo.findByEmail(email));
	}
	@Override
	public List<Content> searchItemByCategory(String item) {
		
		List<Content> list;
	
			list=contentRepo.findAllByCategories(item);
			if(list==null)
			{
				List<Content> list1;
				list1=contentRepo.findAllByMerchant(item);
				return(list1);
			}
			
			return(list);
		
			//return(contentRepo.findByMerchant(item));
	
		
		
	}
	
	@Override
	public List<Content> searchItemByMerchant(String item)
	{
		List<Content> list;
		list=contentRepo.findAllByMerchant(item);
		return(list);
	}
	
	public UserDetail getUsers(String username)
	{
		return(detailrepo.findByUsername(username));
	}

}
