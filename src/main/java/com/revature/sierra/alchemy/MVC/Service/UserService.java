 package com.revature.sierra.alchemy.MVC.Service;

import org.springframework.stereotype.Service;

import com.revature.sierra.alchemy.MVC.Exceptions.IncorrectCredentialsException;
import com.revature.sierra.alchemy.MVC.Exceptions.UsernameAlreadyExistsException;
import com.revature.sierra.alchemy.MVC.Models.Users;

@Service
public interface UserService {

	public Users logIn(Users user) throws IncorrectCredentialsException;
	public Users register(Users newUser) throws UsernameAlreadyExistsException;
	public Users getLogIn(String username);
	public Users getUser(int Id);
}
