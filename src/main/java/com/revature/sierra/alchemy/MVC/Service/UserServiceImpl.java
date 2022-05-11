package com.revature.sierra.alchemy.MVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.sierra.alchemy.MVC.Daos.UserRepo;
import com.revature.sierra.alchemy.MVC.Exceptions.IncorrectCredentialsException;
import com.revature.sierra.alchemy.MVC.Models.Users;

@Service
public class UserServiceImpl implements UserService {

	private UserRepo userRepo;
	
	@Autowired
	public UserServiceImpl(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	@Override
	public Users logIn(String username, String password) throws IncorrectCredentialsException{
		Users user = userRepo.findByUsername(username);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		}else {
			return null;
		}
	}

	@Override
	public Users register(Users newUser) {
		Users user = userRepo.findByUsername(newUser);
		if (user != newUser) {
			newUser.setUsername(user);
			return newUser;
		}
		return null;
	}

	@Override
	public Users getLogIn(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
