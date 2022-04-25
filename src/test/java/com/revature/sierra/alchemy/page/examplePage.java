package com.revature.sierra.alchemy.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class examplePage {
	WebDriver driver;
	
	@FindBy(id="watch7-content")
	WebElement exampleButton;
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/div[3]/a")
	WebElement btn;
	public void goToExamplePage() {
		driver.get("www.youtube.com");
	}
	
	public examplePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickExampleButton() {
		exampleButton.click();
	}
	
	public void clickByID(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public void inputById(String id,String input) {
		driver.findElement(By.id(id)).sendKeys(input);
	}

}
