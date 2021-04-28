package com.shatakshi.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shatakshi.spring.Services.UserService;
import com.shatakshi.spring.entity.UserDetail;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserController
{
	
	 @Autowired
	 private UserService userservice;
	 
     @PostMapping ("/SignIn")
     @CrossOrigin(origins="http://localhost:4200")
     public UserDetail  signin(@RequestBody UserDetail user) throws Exception
     {
    	 String tempemail=user.getUsername();
    	 String temppass=user.getPassword();
    	 UserDetail userobj=null;
    	 if(tempemail!=null &&temppass!=null)
    	 {
    		 userobj=userservice.openAccount(tempemail, temppass);
    	 }
	  
	  if(userobj==null)
	  {
		  throw new Exception("Bad Credentials");
	  }
	  return (userobj);
     }
     		@GetMapping("/hello")
     		public String hello()
     		{
     			return("Got you");
     		}
   
}
