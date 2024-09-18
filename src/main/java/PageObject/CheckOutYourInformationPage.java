package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutYourInformationPage {
	
	WebDriver driver;
	
	
	public CheckOutYourInformationPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	By userName=By.xpath("//input[@placeholder='First Name']");
	By password=By.xpath("//input[@placeholder='Last Name']");
	
	
	By zip=By.xpath("//input[@placeholder='Zip/Postal Code']");
	
	By continueBUtton=By.xpath("//input[@id='continue']");
	
	
	public void  clickOncontinue(String Username, String Password, String zipcode) {
		
	driver.findElement(userName).sendKeys(Username);
	driver.findElement(password).sendKeys(Password);
	driver.findElement(zip).sendKeys(zipcode);
	driver.findElement(continueBUtton).click();
		
	
	
	}
	
	

}
