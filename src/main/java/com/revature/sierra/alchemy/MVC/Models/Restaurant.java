package com.revature.sierra.alchemy.MVC.Models;
import java.util.Objects;

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
	@OneToMany
	@JoinColumn(name="Restaurant_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private int phone;
	@Column
	private String description;
	@Column
	private int avgrating;
	
	public Restaurant() {
		id = 0;
		name ="";
		address ="";
		phone = 0;
		description ="";
		avgrating = 0;
		
		
		
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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAvgrating() {
		return avgrating;
	}

	public void setAvgrating(int avgrating) {
		this.avgrating = avgrating;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, avgrating, description, id, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(address, other.address) && avgrating == other.avgrating
				&& Objects.equals(description, other.description) && id == other.id && Objects.equals(name, other.name)
				&& phone == other.phone;
	}

}
