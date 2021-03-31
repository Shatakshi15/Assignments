package com.shatakshi.spring;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question1 {
	private int questionId;  
	private String question;  
	private Map<Integer,String> answers;
	public Question1(int questionId, String question, Map<Integer, String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}  
	public void display()
	{
	 System.out.println("Question Id: "+questionId+" Question: "+question);  
	    System.out.println("Answers are:");  
	    Set<Entry<Integer, String>> set=answers.entrySet();  
	    Iterator<Entry<Integer, String>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<Integer,String> entry=itr.next();  
	        System.out.println(entry.getKey()+":"+entry.getValue());  
	    }  
}}

