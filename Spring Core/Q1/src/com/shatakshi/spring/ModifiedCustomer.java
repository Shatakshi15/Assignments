package com.shatakshi.spring;

public class ModifiedCustomer {
	private int CustomerId;
	private String CustomerName;
	private long CustomerContact;
	private ModifiedAddress CustomerAddress;
	public ModifiedCustomer(int customerId, String customerName, long customerContact, ModifiedAddress customerAddress) {
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerContact = customerContact;
		CustomerAddress = customerAddress;
	}
	void displayInfo(){  
	    System.out.println("Customer ID = "+CustomerId);
	    System.out.println("Customer Name = "+CustomerName);  
	    System.out.println("Customer Contact = "+CustomerContact);  
	    System.out.println("Customer Address = "+CustomerAddress);  
	}  

}
