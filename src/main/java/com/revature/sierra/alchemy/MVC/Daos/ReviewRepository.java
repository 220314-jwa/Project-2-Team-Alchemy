package com.revature.sierra.alchemy.MVC.Daos;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.sierra.alchemy.MVC.Models.Reviews;


public interface ReviewRepository extends JpaRepository <Reviews, Long> {

	Optional<Reviews> findReviewsById(int restaurant_id);
	
}
