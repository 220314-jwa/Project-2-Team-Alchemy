package com.revature.sierra.alchemy.MVC.Service;

import java.util.List;
import com.revature.sierra.alchemy.MVC.Daos.ReviewRepository;
import com.revature.sierra.alchemy.MVC.Exceptions.RestaurantNotFoundException;
import com.revature.sierra.alchemy.MVC.Models.Reviews;

public interface ReviewService {
	public Reviews addReviews(Reviews reviews);
	public List<Reviews> findAllReviews();
	public Reviews findReviewsById(int restaurant_id);
	public Reviews create(Reviews newReviews) throws RestaurantNotFoundException;
}
