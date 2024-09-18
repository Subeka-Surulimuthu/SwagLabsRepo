package UtilsPackage;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class WebDriverUtis {
	
	WebDriver driver;
	
	public WebDriver getDriver() throws IOException {
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\subek\\OneDrive\\Desktop\\Automation\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		WebDriverManager.chromedriver().setup();
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\subek\\eclipse-workspace\\SwaglabsTesting\\src\\test\\java\\Resource\\global.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			 driver=new ChromeDriver();
			
			//driver.manage().window().maximize();
			
		}
		driver.get("https://www.saucedemo.com/");
		
		return driver;

	
		
		
		
		
	}

}
