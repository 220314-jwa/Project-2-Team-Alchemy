package com.revature.sierra.alchemy.MVC;

public class Food {
	   private String name;
	   public Food(String name){
	       this.setFood(name);
	   }

	   public String getFood(){
	     return this.name;
	   }

	   public void setFood(String name){
	     this.name = name;
	   }
}