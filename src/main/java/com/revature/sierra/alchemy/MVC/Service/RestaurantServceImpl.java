package com.revature.sierra.alchemy.MVC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.sierra.alchemy.MVC.Daos.RestaurantRepo;
import com.revature.sierra.alchemy.MVC.Exceptions.RestaurantNotFoundException;
import com.revature.sierra.alchemy.MVC.Models.Restaurant;

@Service
public class RestaurantServceImpl implements RestaurantService {

	@Autowired
	private RestaurantRepo restaurantRepo;
	
	@Override
	public Restaurant getRestaurant(int id) {
		return restaurantRepo.findById(id);
	}
	
	@Override
	public List<Restaurant> getRestaurant(String searchContext) throws RestaurantNotFoundException {
		List<Restaurant> restaurantList = restaurantRepo.findByRestaurantName(searchContext);
		if(!restaurantList.isEmpty()) {
			return restaurantList;
		} else {
			throw new RestaurantNotFoundException();
		}
	}

}
