 package com.revature.sierra.alchemy.MVC.Service;

import com.revature.sierra.alchemy.MVC.Models.Users;

public interface UserService {

	public Users logIn(String username, String password);
	public Users register(Users newUser);
	
	public Users getLogIn();
}
