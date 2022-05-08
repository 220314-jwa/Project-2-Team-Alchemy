package com.revature.sierra.alchemy.MVC.Models;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reviews {
	@Id
	@OneToOne
	@JoinColumn(name="Restaurant_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	@Column
	private String reviewrating;
	@Column
	private String reviewtext;
	@Column
	private int users;
	@Column
	private Date datecreated;
	@Column
	private int restaurant_id;
	
	public Reviews() {
		id =0;
		reviewrating ="";
		reviewtext ="";
		users = 0;
		this.datecreated= datecreated;
		restaurant_id=0;
		
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

	public int getUsers() {
		return users;
	}

	public void setUsers(int users) {
		this.users = users;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(datecreated, id, restaurant_id, reviewrating, reviewtext, users);
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
		return Objects.equals(datecreated, other.datecreated) && id == other.id && restaurant_id == other.restaurant_id
				&& Objects.equals(reviewrating, other.reviewrating) && Objects.equals(reviewtext, other.reviewtext)
				&& users == other.users;
	}
	
	
	

}
