package UtilsPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObject.PageObjectManager;
import helperfunctions.helperFunction;

public class ProjectManager {
	
	//WebDriver driver;
	
	public WebDriverUtis driverusage;
	public PageObjectManager pagedesign;
	
	public ProjectManager() throws IOException {
		
		driverusage=new WebDriverUtis();
		
		pagedesign=new PageObjectManager(driverusage.getDriver());
		
		
		
		
	}

}
