package com.revature.sierra.alchemy.MVC.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.sierra.alchemy.MVC.Exceptions.RestaurantNotFoundException;
import com.revature.sierra.alchemy.MVC.Models.Restaurant;

@Service
public class RestaurantServceImpl implements RestaurantService {

	@Override
	public List<Restaurant> getRestaurant(String searchContext) throws RestaurantNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
