package com.shatakshi.spring.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.shatakshi.spring.Repository.UserRepository;
import com.shatakshi.spring.entity.UserDetail;
import com.shatakshi.spring.entity.UserDetailsImpl;
@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userrepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//User user = userrepo.findByUsername(username);
		//System.out.println(new userDetail.getUsername());
		//System.out.println(user.getPassword());

		UserDetail user = (userrepo.findByUsername(username));
		
		if(user==null) { new UsernameNotFoundException("User Not Found with username: " + username);}

		return new UserDetailsImpl(user);
		
	
	}
	
	
}
