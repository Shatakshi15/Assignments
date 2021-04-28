package com.shatakshi.spring.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shatakshi.spring.entity.UserDetail;

@Repository

public interface UserRepository extends MongoRepository<UserDetail,String> {
	
	UserDetail findByEmail(String email);
	UserDetail findByEmailAndPassword(String email,String password);
	
		UserDetail findByUsername(String username);
		UserDetail findByUsernameAndPassword(String username, String password);
		
}
