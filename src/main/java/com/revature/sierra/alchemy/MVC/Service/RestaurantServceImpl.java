package com.revature.sierra.alchemy.MVC.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.sierra.alchemy.MVC.Daos.RestaurantRepo;
import com.revature.sierra.alchemy.MVC.Exceptions.RestaurantNotFoundException;
import com.revature.sierra.alchemy.MVC.Models.Restaurant;

@Service
public class RestaurantServceImpl implements RestaurantService {

	private RestaurantRepo restaurantRepo;
	
	@Override
	public List<Restaurant> getRestaurant(String searchContext) throws RestaurantNotFoundException {
		// TODO Auto-generated method stub
		List<Restaurant> restaurantList = restaurantRepo.findByRestaurantName(searchContext);
		return restaurantList;
	}

}
