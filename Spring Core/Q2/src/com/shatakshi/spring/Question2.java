package com.shatakshi.spring;

import java.util.Iterator;
import java.util.Set;

public class Question2 {
	private int questionId;
	private String question;
	private Set<String> answers;
	public Question2(int questionId, String question, Set<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	public void display(){  
	    System.out.println("Question Id: "+questionId+" Question: "+question);  
	    System.out.println("Answers are:");  
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  

}
