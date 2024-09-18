package StepDefenitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import UtilsPackage.ProjectManager;
import io.cucumber.java.After;

public class hooks {
	
	WebDriver driver;
	ProjectManager pm;
	
	public hooks(ProjectManager pm) {
		this.pm=pm;
		
	}
	
	
	@After
	public void closeTheDriver() throws IOException {
		//pm.driverusage.getDriver().close();
		
		pm.pagedesign.driver.close();
		
	}

}
