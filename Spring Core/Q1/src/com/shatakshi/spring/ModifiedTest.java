package com.shatakshi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ModifiedTest {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ModifiedBean.xml");
	      ModifiedCustomer obj = (ModifiedCustomer) context.getBean("obj");
	      obj.displayInfo();
	}
	
}
