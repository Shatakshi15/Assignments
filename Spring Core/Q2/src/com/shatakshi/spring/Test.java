package com.shatakshi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean1.xml");
	      Question obj = (Question) context.getBean("ques");
	      obj.display();
	      Question1 obj1 = (Question1) context.getBean("ques1");
	      obj1.display();
	      Question2 obj2 = (Question2) context.getBean("ques2");
	      obj2.display();
	}

}
