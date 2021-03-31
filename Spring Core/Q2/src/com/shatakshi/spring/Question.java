package com.shatakshi.spring;

import java.util.Iterator;
import java.util.List;


public class Question {
	private int questionId;
	private String question;
	private List<String> answers;
	
	public Question(int id, String name, List<String> answers) {    
	    this.questionId = id;  
	    this.question = name;  
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
