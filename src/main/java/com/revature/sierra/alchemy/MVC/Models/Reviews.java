package com.revature.sierra.alchemy.MVC.Models;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Reviews{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column(name="Rating")
	private int rating;
	@Column(name="reviewrating")
	private int reviewrating;
	@Column(name="reviewtext")
	private String reviewtext;
	//Many reviews to one user who wrote them
	@ManyToOne(cascade= {CascadeType.MERGE})
	@JoinColumn(name="User_ID")
	private Users users;
	@Column(name="datecreated")
	private String datecreated;
	//Many reviews to one restaurant id
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="restaurant_id")
	private Restaurant restaurant;
	
	public Reviews() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getRating() {
		return rating;
	}

	public void setRating(int id) {
		this.rating = id;
	}

	public int getReviewrating() {
		return reviewrating;
	}

	public void setReviewrating(int reviewrating) {
		this.reviewrating = reviewrating;
	}

	public String getReviewtext() {
		return reviewtext;
	}

	public void setReviewtext(String reviewtext) {
		this.reviewtext = reviewtext;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(String datecreated) {
		this.datecreated = datecreated;
	}

	public Restaurant getRestaurant_id() {
		return restaurant;
	}

	public void setRestaurant_id(Restaurant restaurant_id) {
		this.restaurant = restaurant_id;
	}

	
	
	

}
