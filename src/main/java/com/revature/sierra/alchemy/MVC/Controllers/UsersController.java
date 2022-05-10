package com.revature.sierra.alchemy.MVC.Controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.sierra.alchemy.MVC.Models.Users;
import com.revature.sierra.alchemy.MVC.Service.UserService;


@RestController
@RequestMapping(path="/users")
@CrossOrigin(origins="http://localhost:4200") // This localhost will be changed to AWS DB path
public class UsersController {
	// connect UserService
	private UserService userServ;
	//connecting the userservice to the controller class with a dependency injection
	@Autowired
	public UsersController(UserService userServ) {
		this.userServ = userServ;
	}
	
	@GetMapping(path="/checklogin")
	public ResponseEntity<Users> checkLogin(@RequestBody Map<String, String> credentials) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
/*
		String username = credentials.get("username");
		try {
			Users users = userServ.getLogIn(username);
			//return ResponseEntity.ok(users);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch(IncorrectResultSizeDataAccessException e) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}*/
	}
	
	@GetMapping(path="/login")
	public ResponseEntity<Users> logIn(@RequestBody Map<String, String> credentials){
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();

		/*
		String username = credentials.get("username");
		String password = credentials.get("password");
		try {
			Users users = userServ.logIn(username, password);
			//return ResponseEntity.ok(users);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch(IncorrectResultSizeDataAccessException e) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}*/
	}
	
	@PostMapping(path="/register")
	public ResponseEntity<Users> register(@RequestBody Map<String, String> credentials){
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		/*
		
		String username = credentials.get("username");
		String password = credentials.get("password");
		Users user = new Users(username,password);
		try {
			userServ.register(user);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch(IncorrectResultSizeDataAccessException e) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}*/
	}
	
	
	
}

