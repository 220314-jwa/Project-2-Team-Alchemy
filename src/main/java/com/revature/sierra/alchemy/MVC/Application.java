package com.revature.sierra.alchemy.MVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		Restaurant<Food> Mcdonald = (name) -> {
			Food menu = new Food(name);
			return menu;
		};
		Food nugget = Mcdonald.order("nugget");
		
		System.out.println(nugget.getFood());
	}

}
