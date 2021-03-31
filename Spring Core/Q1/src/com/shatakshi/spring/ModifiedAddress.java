package com.shatakshi.spring;

public class ModifiedAddress {
	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;
	public ModifiedAddress(String street, String city, String state, int zip, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	
	public String toString(){  
	    return (street+" "+city+" "+state+" "+country+" "+zip); 
	}
}
