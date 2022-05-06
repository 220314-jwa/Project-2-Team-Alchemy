package com.revature.sierra.alchemy.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class LoginPage {
	WebDriver driver;
	private JavascriptExecutor jsExecutor;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.jsExecutor = (JavascriptExecutor) driver;
	}
	
	public void inputIntoUserName(String input) {
		this.driver.findElement(By.id("username")).sendKeys(input);
	}
	
	public void inputIntoPassword(String input) {
		this.driver.findElement(By.id("password")).sendKeys(input);
	}
	
	public void clickLogin() {
		this.driver.findElement(By.id("btnLogIn")).click();
	}
	
	public String getLoginSession() {
		return this.jsExecutor.executeScript(String.format(
				"return window.sessionStorage.getItem('%s');", "Login-Auth")).toString();
	}
}
