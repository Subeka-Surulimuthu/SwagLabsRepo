package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {
	
	
	WebDriver driver;
	
	public CheckoutCompletePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	//String confo=driver.findElement(By.cssSelector(".complete-header")).getText();
	
	
	By completeText=By.cssSelector(".complete-header");
	
	
	public String getText() {
		
		return driver.findElement(completeText).getText();
	}
	

}
