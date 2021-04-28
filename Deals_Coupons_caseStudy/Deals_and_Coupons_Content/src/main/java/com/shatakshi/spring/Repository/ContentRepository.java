package com.shatakshi.spring.Repository;



import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.shatakshi.spring.entity.Content;

@Repository
public interface ContentRepository extends MongoRepository<Content,String> {



	public List<Content> findAllByCategories(String item);

	public List<Content> findAllByMerchant(String item);

	
	//public Content findById(String item);
	

}
