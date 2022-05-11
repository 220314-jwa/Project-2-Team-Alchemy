package com.revature.sierra.alchemy.MVC.Models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

// Adding JPA annotations  
@Entity
public class Users {
	
	// including the column annotations
	@Id
	//@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
	//@JoinColumn(name="users")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String username;
	@Column
	private String password;
	
	
	public Users() {
	}
	
	public Users(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}
	

	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String user) {
		this.username = user;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	
}
