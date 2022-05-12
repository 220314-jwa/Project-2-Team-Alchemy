package com.revature.sierra.alchemy.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RestaurantPage {
 WebDriver driver;


  public RestaurantPage(WebDriver driver) {
		this.driver = driver;	
  }

  public void InputtoSearchTab(String input) {
	  this.driver.findElement(By.xpath("/html/body/app-root/div/app-restaurants-list/app-restaurants-list-search/div/form/div/input")).sendKeys(input);
  }

  public void clickSearch() {
	  this.driver.findElement(By.xpath("/html/body/app-root/div/app-restaurants-list/app-restaurants-list-search/div/form/div/button")).click();
  }


  public void ClickRestaurant(String restaurantName) {
	  this.driver.findElement(By.xpath("//p[text()[contains(.,'" + restaurantName + "')]]")).click();
  }


	public void ClickReview() {
		this.driver.findElement(By.xpath("/html/body/app-root/div/app-restaurants-list/app-restaurant-info-container/app-restaurant-content/div/div[1]/div[2]/div[4]/button[1]")).click();
	}


	public void ClickWriteReview() {
		this.driver.findElement(By.xpath("/html/body/app-root/div/app-restaurants-list/app-restaurant-info-container/app-restaurant-content/div/div[1]/div[2]/div[4]/button[2]")).click();
	}

	public void ClickSubmitReview() {
		this.driver.findElement(By.xpath("//input[contains(@value,'Submit')]")).click();
	}

	public void EnterReview(String input) {
		 this.driver.findElement(By.xpath("//textarea[contains(@placeholder,'Type Your Review')]")).sendKeys(input);
	}
	
	
	public String getRestaurantPagetitle() {
		return (driver.getCurrentUrl()).toString();
	}
	
	

} 