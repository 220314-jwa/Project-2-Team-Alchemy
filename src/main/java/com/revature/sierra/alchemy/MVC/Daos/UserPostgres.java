package com.revature.sierra.alchemy.MVC.Daos;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserPostgres implements UserRepo{
	private static BeanFactory connFactory = ConnecionFactory.getConnectionFactory();
	
}
