package com.revature.sierra.alchemy.MVC.Models;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reviews{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	@Column
	private String reviewRating;
	@Column
	private String reviewText;
	@Column
	private int users;
	@Column
	private Date dateCreated;
	@Column
	private int restaurantId;
	
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

	public int getUsers() {
		return users;
	}

	public void setUsers(int users) {
		this.users = users;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
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
