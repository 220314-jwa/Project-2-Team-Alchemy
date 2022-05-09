package com.revature.sierra.alchemy.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class HomePage {
	WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickHome() {
		driver.findElement(By.xpath("/html/body/app-root/div/div/app-nav-bar/header/div[2]/nav/ul/li[1]")).click();
	}
	public void clickRestaurant() {
		driver.findElement(By.xpath("/html/body/app-root/div/div/app-nav-bar/header/div[2]/nav/ul/li[2]")).click();
	}
	public void clickLogIn() {
		driver.findElement(By.xpath("/html/body/app-root/div/div/app-nav-bar/header/div[2]/nav/ul/li[3]")).click();
	}
	public void clickSignUp() {
		driver.findElement(By.xpath("/html/body/app-root/div/div/app-nav-bar/header/div[2]/nav/ul/li[4]")).click();
	}
		
	
	
	//Not relevant but here of review
	public void submitById(String id) {
		driver.findElement(By.id(id)).submit();
	}
	
	public void clearById(String id) {
		driver.findElement(By.id(id)).clear();
	}
	
	public void clickByID(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public void inputById(String id,String input) {
		driver.findElement(By.id(id)).sendKeys(input);
	}
	
	public void waitClickableById(String id) {
		Wait<WebDriver> exampleWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(1));
		exampleWait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
	}

}
