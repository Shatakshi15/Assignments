package com.shatakshi.spring.entity;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="details")
public class UserDetail{
	@Id
	private String Id;
	private String name;
	private String password;
	private Long mobileNo;
	private String email;
	private String username;
	private String address;
	private String city;
	private String state;
	private String gender;
	
	private Date dateOfBirth;
	


	public UserDetail(String name,String username,String password, Long mobileNo, String email,
			String address, String city, String state, String gender,  Date dateOfBirth)
	{
		super();
		this.name = name;
		this.password = password;
		this.mobileNo = mobileNo;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.gender = gender;
		this.username=username;
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public UserDetail() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	
}
