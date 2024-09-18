package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	LoginPage(WebDriver driver){
		this.driver=driver;
		
	}
	

	By userName=By.xpath("//input[@placeholder='Username']");
	By password=By.xpath("//input[@placeholder='Password']");
	
	
	By loginButton=By.id("login-button");
	
	public void login(String UserID, String pass) {
		
		driver.findElement(userName).sendKeys(UserID);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	//	driver.switchTo().alert().accept();
		
		
	}
	
	
	
	
	
}
