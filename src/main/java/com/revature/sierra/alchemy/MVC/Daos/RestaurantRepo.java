package com.revature.sierra.alchemy.MVC.Daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.sierra.alchemy.MVC.Models.Restaurant;
import com.revature.sierra.alchemy.MVC.Models.Users;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, String> {
	@Query(value = "SELECT * from Restaurant where Name LIKE '%?1%'", nativeQuery = true)
	public List<Restaurant> findByRestaurantName(String Name);
	public Restaurant findById(int id);
}
