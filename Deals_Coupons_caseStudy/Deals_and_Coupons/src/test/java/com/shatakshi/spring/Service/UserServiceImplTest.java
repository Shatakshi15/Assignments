package com.shatakshi.spring.Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.shatakshi.spring.Repository.UserRepository;
import com.shatakshi.spring.Services.UserServiceImpl;
import com.shatakshi.spring.entity.UserDetail;

class UserServiceImplTest {
	
	@InjectMocks
	UserServiceImpl userService;

	@Mock
	UserRepository userrepo;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void testOpenAccount() {
		
		UserDetail user=new UserDetail();
		user.setUsername("abcd@gmail");
		user.setAddress("defg");
		user.setCity("xhg");
		user.setGender("female");
		user.setMobileNo((long) 236475865);
		user.setDateOfBirth(new Date(24-04-2021));
		user.setName("fgkhk");
		user.setPassword("fgffkj");
		user.setState("jhgk");
		
		
		when(userrepo.findByUsernameAndPassword(anyString(),anyString())).thenReturn(user);
		
		UserDetail userdetail=userService.openAccount("test@test.com","123456");
		assertNotNull(userdetail);
		assertEquals("abcd@gmail",userdetail.getUsername());
	}
	

}
