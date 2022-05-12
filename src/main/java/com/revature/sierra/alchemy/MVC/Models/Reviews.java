package com.revature.sierra.alchemy.MVC.Models;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	@Column
	private String reviewrating;
	@Column
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
	private Restaurant restaurant;
	
	public Reviews() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReviewrating() {
		return reviewrating;
	}

	public void setReviewrating(String reviewrating) {
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

	@Override
	public int hashCode() {
		return Objects.hash(datecreated, id, restaurant, reviewrating, reviewtext, users);
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
		return Objects.equals(datecreated, other.datecreated) && id == other.id && restaurant == other.restaurant
				&& Objects.equals(reviewrating, other.reviewrating) && Objects.equals(reviewtext, other.reviewtext)
				&& users == other.users;
	}
	
	
	

}
