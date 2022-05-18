package com.zensar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.dto.UserDTO;
import com.zensar.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping(value="/jobseeker", consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean loginJobSeeker(@RequestBody UserDTO userDto) {
		return this.userService.loginJobseeker(userDto.getUsername(), userDto.getPassword());
	}

	@PostMapping(value="/employee", consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean loginEmployee(@RequestBody UserDTO userDto) {
		return this.userService.loginEmployee(userDto.getUsername(), userDto.getPassword());
	}
}
