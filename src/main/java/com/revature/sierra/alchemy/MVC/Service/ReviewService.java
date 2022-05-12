package com.revature.sierra.alchemy.MVC.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.sierra.alchemy.MVC.Exceptions.RestaurantNotFoundException;
import com.revature.sierra.alchemy.MVC.Models.Restaurant;
import com.revature.sierra.alchemy.MVC.Models.Reviews;

@Service
public interface ReviewService {
	public Reviews create(Reviews newReviews) throws RestaurantNotFoundException;
	public List<Reviews> getReviews(Restaurant restaurant_id);

}
