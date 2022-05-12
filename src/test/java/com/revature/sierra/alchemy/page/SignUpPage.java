package com.revature.sierra.alchemy.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
	WebDriver driver;
	private JavascriptExecutor jsExecutor;
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		this.jsExecutor = (JavascriptExecutor) driver;
	}
	public void inputIntoFirstName(String input) {
		this.driver.findElement(By.id("fName")).sendKeys(input);
	}
	
	public void inputIntoLastName(String input) {
		this.driver.findElement(By.id("lName")).sendKeys(input);
	}
	
	public void inputIntoEmail(String input) {
		this.driver.findElement(By.id("email")).sendKeys(input);
	}
	public void inputIntoPassword(String input) {
		this.driver.findElement(By.id("password")).sendKeys(input);
	}
	public void clickSubmit() {
		this.driver.findElement(By.id("btnSubmit")).click();
	}
	
	public void clicklogin() {
		this.driver.findElement(By.linkText("Log In")).click();
	}
	
	public String getSignUpPagetitle() {
		return (driver.getCurrentUrl()).toString();
	}
	
	
}



