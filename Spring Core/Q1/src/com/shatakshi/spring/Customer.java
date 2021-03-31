package com.shatakshi.spring;

public class Customer {
private int CustomerId;
private String CustomerName;
private long CustomerContact;
private Address CustomerAddress;
public int getCustomerId() {
	return CustomerId;
}
public void setCustomerId(int customerId) {
	CustomerId = customerId;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}
public long getCustomerContact() {
	return CustomerContact;
}
public void setCustomerContact(long customerContact) {
	CustomerContact = customerContact;
}
public Address getCustomerAddress() {
	return CustomerAddress;
}
public void setCustomerAddress(Address customerAddress) {
	CustomerAddress = customerAddress;
}
void displayInfo(){  
    System.out.println("Customer ID = "+CustomerId);
    System.out.println("Customer Name = "+CustomerName);  
    System.out.println("Customer Contact = "+CustomerContact);  
    System.out.println("Customer Address = "+CustomerAddress);  
}  
}
