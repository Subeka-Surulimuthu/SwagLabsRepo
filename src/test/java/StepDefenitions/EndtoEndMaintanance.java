package StepDefenitions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import PageObject.CheckOutOverviewPage;
import PageObject.CheckOutYourInformationPage;
import PageObject.CheckoutCompletePage;
import PageObject.LoginPage;
import PageObject.ProductsPage;
import PageObject.YourCartPage;
import UtilsPackage.ProjectManager;
import helperfunctions.helperFunction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EndtoEndMaintanance {
	
	
	
	CheckoutCompletePage checkoutcompl;
	CheckOutOverviewPage checkoutovervi;
	CheckOutYourInformationPage checkoutinfo;
	LoginPage login;
	ProductsPage prodpa;
	YourCartPage yourcartPa;
	ProjectManager projectUtils;
	helperFunction hf1;
	
	public EndtoEndMaintanance(ProjectManager projectUtils) {
		
		this.projectUtils=projectUtils;
		
		checkoutcompl=projectUtils.pagedesign.getCheckoutCompletePage();
		checkoutovervi=projectUtils.pagedesign.getCheckOutOverviewPage();
		checkoutinfo=projectUtils.pagedesign.getCheckOutYourInformationPage();
		login=projectUtils.pagedesign.getLoginPageobj();
		prodpa=projectUtils.pagedesign.getProductsPageobj();
		yourcartPa=projectUtils.pagedesign.getYourCartPage();
		hf1=projectUtils.pagedesign.getHelperFunctionObj();
		
		
	}
	
	
	@Given("user1 should be able to login the application")
	public void user1_should_be_able_to_login_the_application() {
		
		login.login("standard_user", "secret_sauce");
		
	}
	
	@When("user1 able to add prodcuts from excel {string} into the cart")
	public void user1_able_to_add_prodcuts_into_the_cart(String excel) throws IOException {
		
		List<Object> prodNsame=new ArrayList<>();
		
		prodNsame=hf1.readDataFromExcel();
		
		prodpa.ClickonProduct(prodNsame);
		
	}
	
	
	@When("user1 should be able to checkout the product")
	public void user1_should_be_able_to_checkout_the_product() {
		
		yourcartPa.Yourcartclick();
		checkoutinfo.clickOncontinue("dfdds", "sddsds", "123434");
		checkoutovervi.clickOnContinue();
		
		
	}
	
	
	@Then("validate the products added successfully on cart")
	public void validate_the_products_added_successfully_on_cart() {
		String Expected=checkoutcompl.getText();
		
		Assert.assertEquals("Thank you for your order!", Expected);
		
	}
	
	

}
