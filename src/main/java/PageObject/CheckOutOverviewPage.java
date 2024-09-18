package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverviewPage {
	
	WebDriver driver;
	public CheckOutOverviewPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	By continueButton=By.xpath("//button[@id='finish']");
	
	public void clickOnContinue() {
		driver.findElement(continueButton).click();
	}
	
	//	driver.findElement(By.xpath("//button[@id='finish']")).click();

}
