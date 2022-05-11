 package com.revature.sierra.alchemy.MVC.Service;

import org.springframework.stereotype.Service;

import com.revature.sierra.alchemy.MVC.Models.Users;

@Service
public interface UserService {

	public Users logIn(String username, String password);
	public void register(Users newUser);
	
	public Users getLogIn(String username);
}
