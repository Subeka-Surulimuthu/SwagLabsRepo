package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helperfunctions.helperFunction;

public class YourCartPage extends helperFunction{
	
	WebDriver driver;
	
	public YourCartPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	
	By yourCart=By.cssSelector(".shopping_cart_link");
	
	By waitLocator=By.cssSelector("#checkout");
	
	
	
	By Checkout=By.cssSelector("#checkout");
	
	public void Yourcartclick() {
		
		driver.findElement(yourCart).click();
		waitUNtillVIsibility(waitLocator);
		driver.findElement(Checkout).click();
		
	}
	
	
	

}
