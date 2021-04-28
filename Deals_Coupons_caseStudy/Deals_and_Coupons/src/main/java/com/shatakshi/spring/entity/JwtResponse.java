package com.shatakshi.spring.entity;

import java.io.Serializable;

public class JwtResponse implements Serializable {
  String token;
 private static final long serialVersionUID = 5926468583005150707L;

public JwtResponse() {

	// TODO Auto-generated constructor stub
}

public JwtResponse(String token) {

	this.token = token;
}

public String getToken() {
	return token;
}

public void setToken(String token) {
	this.token = token;
}
 

}
