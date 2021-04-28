package com.shatakshi.spring.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shatakshi.spring.Services.ContentService;
import com.shatakshi.spring.entity.Content;
import com.shatakshi.spring.entity.UserDetail;

@RestController
public class ContentController {
	
	@Autowired
	private ContentService contentservice;
	
	@GetMapping("/search")
  	public List<Content> search(@RequestParam String item ) throws Exception
	{
		
		List<Content> cont=null;
		if(item!=null)
		{
			cont=contentservice.searchItemByCategory(item);

		}
		if(cont==null)
		{
			cont=contentservice.searchItemByMerchant(item);
			
		}
		if(cont==null)
		{
			throw new Exception("Not Found item");
		}
		return cont;
	}
	 @PostMapping("/SignUp")
     @CrossOrigin(origins="http://localhost:4200")
     public UserDetail signup(@RequestBody UserDetail user ) throws Exception
     {
    	 String tempEmail=user.getEmail();
    	 if(tempEmail!=null && !"".equals(tempEmail))
    	 {
    		 UserDetail newUser=contentservice.fetchEmail(tempEmail);
    		 if(newUser!=null)
    		 {
    			 throw new Exception("User with this email Id already exists");
    		 }
    	 }
    	 UserDetail newUser=null;
    	 newUser =contentservice.createAccount(user);
 		
	   return(newUser);
     }
	 
	 @GetMapping("/getusers")
	 @CrossOrigin(origins="http://localhost:4200")
	 public UserDetail getUser(@RequestParam String username)
	 {
		 return(contentservice.getUsers(username));
	 }
}
