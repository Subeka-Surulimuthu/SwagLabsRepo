import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MainTesting {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		List<String> prods=List.of("Sauce Labs Backpack","Sauce Labs Fleece Jacket");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		By userName=By.xpath("//input[@placeholder='Username']");
		By password=By.xpath("//input[@placeholder='Password']");
		
		
		By loginButton=By.id("login-button");
		

		driver.findElement(userName).sendKeys("standard_user");
		driver.findElement(password).sendKeys("secret_sauce");
		driver.findElement(loginButton).click();

		Thread.sleep(2000);
		
		
		List<WebElement> totalprod=driver.findElements(By.cssSelector(".inventory_item_description"));
		
		

		
	//	WebElement req=totalprod.stream().filter(product->product.findElement(By.cssSelector(".inventory_item_name ")).getText().equalsIgnoreCase("Sauce Labs Backpack")).findAny().orElse(null);
		
		
	//	req.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
		List<String> prodname=new ArrayList<>();
		prodname.add("Sauce Labs Backpack");
		prodname.add("Sauce Labs Bike Light");
		List<String> ActualProducts=new ArrayList<>();
		List<String> ValidProd=new ArrayList<>();
		List<String> invalidProd=new ArrayList<>();
		
		for(WebElement pro:totalprod) {
			
			String temp=pro.findElement(By.cssSelector(".inventory_item_name ")).getText();
			ActualProducts.add(temp);
			
		}
		
		for(String p:prodname) {
			
			if(ActualProducts.contains(p)) {
				ValidProd.add(p);
			}else {
				invalidProd.add(p);
			}
		}
		
		
		int flag=0;
		for(int i=0;i<totalprod.size();i++) {
		while(flag<ValidProd.size()) {
			
			Thread.sleep(4000);
			
				
				String temp=totalprod.get(i).findElement(By.cssSelector(".inventory_item_name ")).getText();
			
				if(ValidProd.contains(temp)) {
					totalprod.get(i).findElement(By.xpath("//button[text()='Add to cart']")).click();
					flag++;
					
				}
				}
		}
		
		
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#checkout")));
		driver.findElement(By.cssSelector("#checkout")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("djhfdskfhsdk");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("fhfdsds");
		
		
		driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']")).sendKeys("324234");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		String confo=driver.findElement(By.cssSelector(".complete-header")).getText();
		
		System.out.println(confo);
		
		
	}

}
