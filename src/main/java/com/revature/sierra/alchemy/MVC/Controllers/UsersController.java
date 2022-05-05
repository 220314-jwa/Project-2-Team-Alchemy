package com.revature.sierra.alchemy.MVC.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/users") 
@CrossOrigin(origins="http://localhost:4200") 
public class UsersController {
	
	@GetMapping
	public ResponseEntity<Integer> getUser(){
		Integer a = 1;
		return ResponseEntity.ok(a);
	}
	
	@PutMapping(path="/{userID}")
	public ResponseEntity<Integer> getUserById(@PathVariable int userID){
		return ResponseEntity.ok(1);
	}
}
