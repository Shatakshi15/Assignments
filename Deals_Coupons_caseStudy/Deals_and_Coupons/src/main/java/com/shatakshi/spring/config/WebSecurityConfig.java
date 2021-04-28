package com.shatakshi.spring.config;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.shatakshi.spring.Helper.JwtAuthenticationPoint;
import com.shatakshi.spring.Helper.JwtFilter;
import com.shatakshi.spring.Services.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private JwtFilter jwtFilter;
	@Autowired
	private CustomUserDetailsService customUserDetailsService;

	 
	@SuppressWarnings("deprecation")
	@Bean
	public PasswordEncoder passwordEncoder() {
		return  NoOpPasswordEncoder.getInstance();
	}
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	} 
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customUserDetailsService);
		
	}
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity.csrf().disable()
				.cors().disable()
				.authorizeRequests().antMatchers("/authenticate").permitAll().
				// all other requests need to be authenticated
				anyRequest().authenticated().and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	
		httpSecurity.addFilterBefore(jwtFilter,UsernamePasswordAuthenticationFilter.class );
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		 web.ignoring().antMatchers("/v2/api-docs",
                 "/configuration/ui",
                 "/swagger-resources/**",
                 "/configuration/security",
                 "/swagger-ui.html",
                 "/webjars/**");
	}
	
	
}
