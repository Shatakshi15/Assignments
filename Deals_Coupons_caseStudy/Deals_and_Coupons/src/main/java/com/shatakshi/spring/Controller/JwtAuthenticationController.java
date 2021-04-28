package com.shatakshi.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shatakshi.spring.Services.CustomUserDetailsService;
import com.shatakshi.spring.entity.JwtRequest;
import com.shatakshi.spring.entity.JwtResponse;
import com.shatakshi.spring.util.JwtTokenUtil;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class JwtAuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
		System.out.println(authenticationRequest);
		try {	
				this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
					} catch (DisabledException e) {
						throw new Exception("USER_DISABLED", e);
					} catch (BadCredentialsException e) {
						throw new Exception("INVALID_CREDENTIALS", e);
					}
		  UserDetails userDetails =this.customUserDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());
		 String token =this.jwtTokenUtil.generateToken(userDetails);
		 System.out.println("JWT"+token);
		return ResponseEntity.ok(new JwtResponse(token));
	}
	  
}
