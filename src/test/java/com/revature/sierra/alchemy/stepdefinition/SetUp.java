package com.revature.sierra.alchemy.stepdefinition;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.sierra.alchemy.page.PageController;

public class SetUp {
	static WebDriver driver;
	public PageController pageController;
	public SetUp() {
		File file = new File("src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());//Environmental variable
		driver = new ChromeDriver(); //default to find environmental variable 
		driver.get("http://localhost:4200");
		pageController = new PageController(driver);
	}
}
