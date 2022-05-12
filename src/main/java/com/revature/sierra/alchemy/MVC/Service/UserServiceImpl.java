package com.revature.sierra.alchemy.MVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.sierra.alchemy.MVC.Daos.UserRepo;
import com.revature.sierra.alchemy.MVC.Exceptions.IncorrectCredentialsException;
import com.revature.sierra.alchemy.MVC.Exceptions.UsernameAlreadyExistsException;
import com.revature.sierra.alchemy.MVC.Models.Users;

@Service
public class UserServiceImpl implements UserService {

	private UserRepo userRepo;
	
	@Autowired
	public UserServiceImpl(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	@Override
	public Users getUser(int Id) {
		Users user = userRepo.getById(Id);
		return user;
	}
	
	@Override
	public Users logIn(Users user) throws IncorrectCredentialsException{
		Users logInUser = userRepo.findByUsername(user.getUsername());
		if (user != null && logInUser.getPassword().equals(user.getPassword())) {
			return logInUser;
		}else {
			throw new IncorrectCredentialsException();
		}
	}

	@Override
	public Users register(Users newUser) throws UsernameAlreadyExistsException {
		int newUserID = userRepo.save(newUser).getId();
		if (newUserID != 0) {
			newUser.setId(newUserID);
			return newUser;
		} else {
			throw new UsernameAlreadyExistsException();
		}
	}

	@Override
	public Users getLogIn(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
