package PageObject;

import org.openqa.selenium.WebDriver;

import helperfunctions.helperFunction;

public class PageObjectManager {
	
	public WebDriver driver;
	
	CheckoutCompletePage checkoutcomplete;
	CheckOutOverviewPage checkoutOverviewObj;
	CheckOutYourInformationPage checkoutyourinfopageobj;
	LoginPage loginPageObj;
	ProductsPage productspageObj;
	YourCartPage yourcartpageobj;
	public helperFunction helper;
	
	public PageObjectManager(WebDriver driver) {
		
		this.driver=driver;		
		
	}
	
	
	public helperFunction getHelperFunctionObj() {
		
		helper=new helperFunction(driver);
		return helper;
	}
	
	public CheckoutCompletePage getCheckoutCompletePage() {
		checkoutcomplete	=new CheckoutCompletePage(driver);
		return checkoutcomplete;
		
	}
	
	public CheckOutOverviewPage getCheckOutOverviewPage() {
		
		
		checkoutOverviewObj=new CheckOutOverviewPage(driver);
		return checkoutOverviewObj;
	}
	
	
	public CheckOutYourInformationPage getCheckOutYourInformationPage() {
		
		checkoutyourinfopageobj=new CheckOutYourInformationPage(driver);
		return checkoutyourinfopageobj;
	}
	

	public LoginPage getLoginPageobj() {
		
		loginPageObj=new LoginPage(driver);
		return loginPageObj;
	}
	
	
	public ProductsPage getProductsPageobj() {
		productspageObj=new ProductsPage(driver);
		return productspageObj;
		
	}
	
	public YourCartPage getYourCartPage() {
		yourcartpageobj=new YourCartPage(driver);
		return yourcartpageobj;
	}
}
