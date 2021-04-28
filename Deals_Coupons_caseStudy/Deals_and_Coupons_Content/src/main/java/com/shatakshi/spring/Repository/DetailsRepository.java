package com.shatakshi.spring.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shatakshi.spring.entity.UserDetail;

@Repository
public interface DetailsRepository extends MongoRepository<UserDetail,String> {
	
	public UserDetail findByEmail(String email);

	public UserDetail findByUsername(String username);


}
