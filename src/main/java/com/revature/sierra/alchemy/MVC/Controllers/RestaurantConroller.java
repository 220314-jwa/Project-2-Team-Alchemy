package com.revature.sierra.alchemy.MVC.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.sierra.alchemy.MVC.Exceptions.RestaurantNotFoundException;
import com.revature.sierra.alchemy.MVC.Models.Reviews;
import com.revature.sierra.alchemy.MVC.Service.ReviewService;


@RestController
@RequestMapping(path="/restaurants")
@CrossOrigin(origins="http://localhost:4200")
public class RestaurantConroller {
	private ReviewService reviewServ;
	
	@Autowired
	public RestaurantConroller(ReviewService reviewServ) {
		this.reviewServ=reviewServ;
	}
	
	@GetMapping(path="/restaurants/{restaurantId}/get-reviews")
	public ResponseEntity<List<Reviews>> getReviews(@PathVariable int restaurant_id){
		List<Reviews> review = reviewServ.getReviews(restaurant_id);
		if(review != null ) {
			return ResponseEntity.ok(review);
		} else {
			return ResponseEntity.notFound().build();
		}
			
	}
	
	@PostMapping
	public ResponseEntity<Reviews> createReviews(@RequestBody Reviews review){
		try {
			review = reviewServ.create(review);
			return ResponseEntity.ok(review);
		} catch (RestaurantNotFoundException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
	}
	
	

}
