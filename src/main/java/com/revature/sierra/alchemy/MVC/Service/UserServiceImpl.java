package com.revature.sierra.alchemy.MVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.sierra.alchemy.MVC.Daos.UserRepo;
import com.revature.sierra.alchemy.MVC.Models.Users;

@Service
public class UserServiceImpl implements UserService {

	private UserRepo userRepo;
	
	@Autowired
	public UserServiceImpl(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	@Override
	public Users logIn(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void register(Users newUser) {
		// TODO Auto-generated method stub
	}

	@Override
	public Users getLogIn(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
