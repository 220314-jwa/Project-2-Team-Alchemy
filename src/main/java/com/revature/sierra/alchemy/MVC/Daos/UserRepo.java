package com.revature.sierra.alchemy.MVC.Daos;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.sierra.alchemy.MVC.Models.Users;

//stereotypes go over classes
@Repository
public interface UserRepo extends JpaRepository<Users, String>{
		//return the list of registered users 
		public Users findByUsername(String username);
		public Users findByUsername(Users username);
		
		
		
}
