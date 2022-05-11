package com.revature.sierra.alchemy.MVC.Models;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
=======
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
>>>>>>> f7af0b9c2eb01e6d1797a0beab838d2691b7e3b1

@Entity
public class Reviews{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	@Column
	private String reviewRating;
	@Column
<<<<<<< HEAD
	private String reviewText;
	@Column
	private int users;
	@Column
	private Date dateCreated;
	@Column
	private int restaurantId;
=======
	private String reviewtext;
	//Many reviews to one user who wrote them
	@ManyToOne
	@JoinColumn(name="users_id")
	private Users users;
	@Column
	private String datecreated;
	//Many reviews to one restaurant id
	@ManyToOne
	@JoinColumn(name="restaurant_id")
	private Restaurant restaurant_id;
>>>>>>> f7af0b9c2eb01e6d1797a0beab838d2691b7e3b1
	
	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reviews(Long id, String reviewRating, String reviewText, int users, Date dateCreated, int restaurantId) {
		super();
		this.id = id;
		this.reviewRating = reviewRating;
		this.reviewText = reviewText;
		this.users = users;
		this.dateCreated = dateCreated;
		this.restaurantId = restaurantId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReviewRating() {
		return reviewRating;
	}

	public void setReviewRating(String reviewRating) {
		this.reviewRating = reviewRating;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

<<<<<<< HEAD
	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
=======
	public Restaurant getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(Restaurant restaurant_id) {
		this.restaurant_id = restaurant_id;
>>>>>>> f7af0b9c2eb01e6d1797a0beab838d2691b7e3b1
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateCreated, id, restaurantId, reviewRating, reviewText, users);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reviews other = (Reviews) obj;
		return Objects.equals(dateCreated, other.dateCreated) && Objects.equals(id, other.id)
				&& restaurantId == other.restaurantId && Objects.equals(reviewRating, other.reviewRating)
				&& Objects.equals(reviewText, other.reviewText) && users == other.users;
	}
	
}
