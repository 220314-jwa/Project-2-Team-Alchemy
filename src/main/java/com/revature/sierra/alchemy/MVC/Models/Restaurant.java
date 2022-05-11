package com.revature.sierra.alchemy.MVC.Models;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Restaurant {
	@Id
	//@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
	//@JoinColumn(name="Restaurant_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String phone;
	@Column
	private String description;
	@Column
	private double avgrating;
	
	public Restaurant() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public double getAvgrating() {
		return avgrating;
	}

	public void setAvgrating(double avgrating) {
		this.avgrating = avgrating;
	}


}
