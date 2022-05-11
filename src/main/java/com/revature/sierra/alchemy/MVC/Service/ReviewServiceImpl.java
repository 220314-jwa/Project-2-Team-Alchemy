package com.revature.sierra.alchemy.MVC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.sierra.alchemy.MVC.Daos.ReviewRepository;
import com.revature.sierra.alchemy.MVC.Daos.ReviewsRepository;
import com.revature.sierra.alchemy.MVC.Exceptions.RestaurantNotFoundException;
import com.revature.sierra.alchemy.MVC.Exceptions.UserNotFoundException;
import com.revature.sierra.alchemy.MVC.Models.Reviews;

@Service
public class ReviewServiceImpl implements ReviewService{
	private ReviewRepository reviewRepo;
	
@Autowired
	public ReviewServiceImpl(ReviewRepository reviewRepo) {
		this.reviewRepo= reviewRepo;
	}
	
    public Reviews addReviews(Reviews reviews){													//first we generate a reviewId
        reviews.getLoginId();                               ////login method imported frm a diff class
        return reviewRepo.save(reviews);
    }

    public List<Reviews> findAllReviews()   {
        return reviewRepo.findAll();
    }

    public Reviews findReviewsById(int restaurant_id) {
    	return reviewRepo.findReviewsById(restaurant_id).orElseThrow(() -> new UserNotFoundException("Restaurant not found");
    }

	
	/*@Override
	public Reviews create(Reviews newReviews) throws RestaurantNotFoundException  {
		int id = reviewrepo.save(newReviews).getId();
		if(id != 0) {
			newReviews.setId(id);
			return newReviews;
		} else {
			throw new RestaurantNotFoundException();
		}*/

}
