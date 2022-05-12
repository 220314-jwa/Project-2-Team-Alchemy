package com.revature.sierra.alchemy.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.revature.sierra.alchemy.MVC.Application;
import com.revature.sierra.alchemy.MVC.Daos.UserRepo;
import com.revature.sierra.alchemy.MVC.Exceptions.IncorrectCredentialsException;
import com.revature.sierra.alchemy.MVC.Exceptions.UsernameAlreadyExistsException;
import com.revature.sierra.alchemy.MVC.Models.Users;
import com.revature.sierra.alchemy.MVC.Service.UserService;

@SpringBootTest(classes=Application.class)
public class UserServiceTest {
	@MockBean
	private UserRepo userRepo;
	@Autowired
	private UserService userServ;
	@Test
	public void logInSuccessfully() throws IncorrectCredentialsException {
		//setup the username and password 
		String username = "user";
		String password = "alchemy";
		
		//mock test for the username
		Users mockUser = new Users();
		mockUser.setUsername(username);
		when(userRepo.findByUsername(mockUser)).thenReturn(mockUser);
		
		// calling the method to test the mockUser
		Users result = userServ.logIn(username, password);
		
		//assertion
		assertEquals(username, result.getUsername());
	}
	@Test
	public void registerSuccessfully() throws UsernameAlreadyExistsException {
		Users newUser = new Users();
		when(userRepo.save(newUser)).thenReturn(newUser);
		
		Users result = userServ.register(newUser);

	}
	
}
