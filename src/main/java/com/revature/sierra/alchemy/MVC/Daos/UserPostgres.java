package com.revature.sierra.alchemy.MVC.Daos;

import org.springframework.stereotype.Repository;

@Repository
public class UserPostgres implements UserRepo{
	private static ConnecionFactory connFactory = ConnecionFactory.getConnectionFactory();
	
}
