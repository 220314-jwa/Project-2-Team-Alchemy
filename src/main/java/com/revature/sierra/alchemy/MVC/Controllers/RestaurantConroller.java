package com.revature.sierra.alchemy.MVC.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.revature.sierra.alchemy.MVC.Restaurant;
import com.revature.sierra.alchemy.MVC.Service.UserService;

@Controller
@RequestMapping(path="/Restaurant")
@CrossOrigin(origins="http://localhost:4200")
public class RestaurantConroller {
 private UserService userServ;
 
 @Autowired
 public RestaurantController(UserService userServ) {
 this.userServ = userServ;
 }
 @GetMapping(path="/{restaurantId}")
 public ResponseEntity RestaurantId (@PathVariable int petId) {
		Restaurant Restaurant = userServ.getRestaurantById(petId);

}
}