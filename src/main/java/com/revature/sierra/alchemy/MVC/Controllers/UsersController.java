package com.revature.sierra.alchemy.MVC.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.revature.sierra.alchemy.MVC.Models.Users;


@RestController
@Controller
@CrossOrigin(origins="http://localhost:4200")
public class UsersController {

public ResponseEntity<List<Users>> getLogin() {
		
	}
}
