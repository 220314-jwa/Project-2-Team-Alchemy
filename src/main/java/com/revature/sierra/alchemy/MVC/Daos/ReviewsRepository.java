package com.revature.sierra.alchemy.MVC.Daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.sierra.alchemy.MVC.Models.Restaurant;
import com.revature.sierra.alchemy.MVC.Models.Reviews;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Integer> {

	public List<Reviews> findByRestaurantId(int restaurant_id);
}
