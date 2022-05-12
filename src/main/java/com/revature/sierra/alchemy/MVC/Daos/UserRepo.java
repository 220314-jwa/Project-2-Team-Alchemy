package com.revature.sierra.alchemy.MVC.Daos;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.sierra.alchemy.MVC.Models.Users;

//stereotypes go over classes
@Repository
public interface UserRepo extends JpaRepository<Users, String>{
		//return the list of registered users 
		public Users findByUsername(String username);
		@Query(value = "SELECT * from Users where User_ID=?1", nativeQuery = true)
		public Users getById(int id);
		
		
		
}
