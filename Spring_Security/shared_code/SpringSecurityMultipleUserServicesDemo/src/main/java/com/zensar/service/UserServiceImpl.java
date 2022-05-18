package com.zensar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	@Qualifier("authManagerForEmployee")
	AuthenticationManager authenticationManagerForEmployee;

	@Autowired
	@Qualifier("authManagerForJobseeker")
	AuthenticationManager authenticationManagerForJobseeker;
	
	@Override
	public boolean loginEmployee(String username, String password) {
		try {
			authenticationManagerForEmployee.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean loginJobseeker(String username, String password) {
		try {
			authenticationManagerForJobseeker.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
