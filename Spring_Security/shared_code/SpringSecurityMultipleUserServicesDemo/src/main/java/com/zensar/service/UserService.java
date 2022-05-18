package com.zensar.service;

public interface UserService {
	boolean loginEmployee(String username, String password);
	boolean loginJobseeker(String username, String password);
}
