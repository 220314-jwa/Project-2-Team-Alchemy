package com.revature.sierra.alchemy.MVC.Models;

import javax.persistence.Column;
import javax.persistence.Entity;

// Adding JPA annotations  
@Entity
public class Users {
	
	// including the column annotations
	@Column
	private String username;
	@Column
	private String password;
	
	
	public Users() {

		String username = "";
		String password = "";
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
	
	
}
