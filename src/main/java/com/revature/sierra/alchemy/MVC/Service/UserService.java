 package com.revature.sierra.alchemy.MVC.Service;

import org.springframework.stereotype.Service;

import com.revature.sierra.alchemy.MVC.Exceptions.IncorrectCredentialsException;
import com.revature.sierra.alchemy.MVC.Models.Users;


public interface UserService {

	public Users logIn(String username, String password) throws IncorrectCredentialsException;
	public Users register(Users newUser);
	public Users getLogIn(String username);
}
