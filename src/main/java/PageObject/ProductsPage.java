package PageObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
	
	
	
	WebDriver driver;
	public ProductsPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	
	
	By totalprods=By.cssSelector(".inventory_item_description");
	
	

	public void ClickonProduct(List<Object> prodNsame) {
		
		
		
		
		List<WebElement> totalprod=driver.findElements(totalprods);
		
		List<String> ActualProducts=new ArrayList<>();
		List<String> ValidProd=new ArrayList<>();
		List<String> invalidProd=new ArrayList<>();
		
		for(WebElement pro:totalprod) {
			
			String temp=pro.findElement(By.cssSelector(".inventory_item_name ")).getText();
			ActualProducts.add(temp);
			
		}
		
		for(Object p:prodNsame) {
			
			if(ActualProducts.contains(p)) {
				ValidProd.add((String) p);
				
			}else {
				invalidProd.add((String) p);
			}
		}
		System.out.println(ValidProd);
		
		int flag=0;
		while(flag<ValidProd.size()) {
		for(int i=0;i<totalprod.size();i++) {
		
			String temp=totalprod.get(i).findElement(By.cssSelector(".inventory_item_name ")).getText();
			
				if(ValidProd.contains(temp)) {
					totalprod.get(i).findElement(By.xpath("//button[text()='Add to cart']")).click();
					flag++;
					
				}
				}
		}
		
		
		
		
	
	
	
	
	}
}
