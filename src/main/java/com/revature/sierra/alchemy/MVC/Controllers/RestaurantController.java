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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.revature.sierra.alchemy.MVC.Exceptions.RestaurantNotFoundException;
import com.revature.sierra.alchemy.MVC.Models.Restaurant;
import com.revature.sierra.alchemy.MVC.Models.Reviews;
import com.revature.sierra.alchemy.MVC.Models.Users;
import com.revature.sierra.alchemy.MVC.Service.RestaurantService;
import com.revature.sierra.alchemy.MVC.Service.ReviewService;
import com.revature.sierra.alchemy.MVC.Service.UserService;


@RestController
@RequestMapping(path="/restaurants")
@CrossOrigin(origins="http://localhost:8080")
public class RestaurantController {
	@Autowired
	private ReviewService reviewServ;
	@Autowired
	private UserService userServ;
	@Autowired
	private RestaurantService restaurantServ;
	
	
	@GetMapping(path="/search/{searchText}")
	public ResponseEntity<List<Restaurant>> searchRestaurant(@PathVariable String searchContext) throws RestaurantNotFoundException{
		List<Restaurant> restaurantList = restaurantServ.getRestaurant(searchContext);
		if(restaurantList != null ) {
			return ResponseEntity.ok(restaurantList);
			//return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} else {
			return ResponseEntity.notFound().build();
		}
			
	}
	
	
	@GetMapping(path="/{restaurant_id}/get-reviews")
	public ResponseEntity<List<Reviews>> getReviews(@PathVariable int restaurant_id){
		List<Reviews> review = reviewServ.getReviews(restaurant_id);
		if(review != null ) {
			//return ResponseEntity.ok(review);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} else {
			return ResponseEntity.notFound().build();
		}
			
	}
	
	@PostMapping(path="/{restaurantId}/post-reviews")
	@ResponseBody
	public ResponseEntity<Reviews> createReviews(@PathVariable int restaurantId, @RequestBody Map<String, String> reviewJson){
		Reviews review = new Reviews();
		Restaurant restaurant = new Restaurant();
		Users user = new Users();
		user.setUsername(reviewJson.get("user"));
		restaurant.setId(restaurantId);
		review.setRating(Integer.parseInt(reviewJson.get("rating")));
		review.setRestaurant_id(restaurant);
		review.setUsers(user);
		review.setReviewtext(reviewJson.get("reviewtext"));
		review.setReviewrating(Integer.parseInt(reviewJson.get("reviewrating")));
		try {
			reviewServ.create(review);
			//return ResponseEntity.ok(review);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch (RestaurantNotFoundException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
	}
	
	

}
