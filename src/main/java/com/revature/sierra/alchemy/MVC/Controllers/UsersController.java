package com.revature.sierra.alchemy.MVC.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.sierra.alchemy.MVC.Models.Users;
import com.revature.sierra.alchemy.MVC.Service.UserService;


@RestController
@Controller
@CrossOrigin(origins="http://localhost:4200") // This localhost will be changed to AWS DB path
public class UsersController {
	// connect UserService
	private UserService userServ;
	//connecting the userservice to the controller class with a dependency injection
	@Autowired
	public UsersController(UserService userServ) {
		this.userServ = userServ;
	}
	
	//@GetMapping(path="/login")
//public ResponseEntity<List<Users>> getUser() {
	//	List<Users> user = this.userServ.getLogIn();
//		return ResponseEntity.ok(user);
//}
}