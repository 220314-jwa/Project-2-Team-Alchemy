package Controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.http.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.sierra.alchemy.MVC.Application;
import com.revature.sierra.alchemy.MVC.Controllers.UsersController;
import com.revature.sierra.alchemy.MVC.Service.ReviewService;
import com.revature.sierra.alchemy.MVC.Service.UserService;
import com.revature.sierra.alchemy.MVC.Models.*;

@SpringBootTest(classes=Application.class)
public class RestaurantControllerTest {
	@MockBean
	private ReviewService reviewService;
	@Autowired
	private UsersController userController;
	@Autowired
	private WebApplicationContext context;
	
	private ObjectMapper jsonMapper = new ObjectMapper();
	
	private MockMvc mockMvc;
	
	@BeforeEach
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void GetReview() throws JsonProcessingException, Exception {
		List<Reviews> mockReviewList = Collections.emptyList();
		when(reviewService.getReviews(1)).thenReturn(mockReviewList);
		
		mockMvc.perform(get("/restaurants/1/get-reviews"))
		.andExpect(status().isOk())
		.andExpect(content().json(jsonMapper.writeValueAsString(mockReviewList)));

	}
	
	@Test
	public void PostReview() throws JsonProcessingException, Exception {
		
		Map<String, String> mockReview = new HashMap<String, String>();
		mockReview.put("reviewrating", "0");
		mockReview.put("reviewtext", "test");
		mockReview.put("datecreated", "test");
		mockReview.put("rating","0");
		mockReview.put("users","test");
		mockReview.put("restaurant", "1");
		String mockReviewJSON = jsonMapper.writeValueAsString(mockReview);
		
		Users mockUser = new Users();
		mockUser.setId(1);
		Restaurant mockRestaurant = new Restaurant();
		mockRestaurant.setId(1);
		Reviews review = new Reviews();
		review.setDatecreated("test");
		review.setRestaurant_id(mockRestaurant);
		review.setRating(0);
		review.setReviewrating(0);
		review.setUsers(mockUser);
		review.setReviewtext("test");
		when(reviewService.create(review)).thenReturn(review);

		mockMvc.perform(post("/restaurants/1/post-reviews")
							.content(mockReviewJSON)
							.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(content().json(jsonMapper.writeValueAsString(mockReviewJSON)));

	}
}
