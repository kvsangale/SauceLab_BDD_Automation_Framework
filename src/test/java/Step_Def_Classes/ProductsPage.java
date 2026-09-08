package Step_Def_Classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import POM_Classes.loginPage;
import POM_Classes.productsPage;
import QA.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsPage {
	
	loginPage lgn = new loginPage(DriverFactory.getdriver());
	productsPage PrPage = new productsPage(DriverFactory.getdriver());
	
	
	@Given("user is logged into SauceDemo application")
	public void user_is_logged_into_sauce_demo_application() {
	    WebDriver driver = DriverFactory.getdriver();
	        driver.get("https://www.saucedemo.com/");
	        lgn.enterUsername("standard_user");
	        lgn.enterPassword("secret_sauce");
	        lgn.clickOnLoginBtn(); 
	}

	@Given("user is on the Products page")
	public void user_is_on_the_products_page() {
	   
		String PageTitle = PrPage.getPageTitle();
		Assert.assertEquals(PageTitle, "Products");
	}

	@Then("Products page should be displayed")
	public void products_page_should_be_displayed() {
		
	  
	  
	}

	@Then("Products page title should be {string}")
	public void products_page_title_should_be(String PageTitle) {
	   
		String title =PrPage.getPageTitle();
		
		Assert.assertEquals(title, PageTitle);
	}

	@Then("product list should be displayed")
	public void product_list_should_be_displayed() {
		
		List<String> allProducts=  PrPage.getAllProducts();
		  
		  System.out.println(allProducts);	
	}

	@Then("all available products should be displayed")
	public void all_available_products_should_be_displayed() {
	 
		List<String> ListOfAllAvailableProducts =PrPage.getAllProducts();
		
		System.out.println(ListOfAllAvailableProducts);
	}

	@Then("each product should have a product name")
	public void each_product_should_have_a_product_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("each product should have a product price")
	public void each_product_should_have_a_product_price() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("each product should have an Add to cart button")
	public void each_product_should_have_an_add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user views the product list")
	public void user_views_the_product_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("each product should display its correct price")
	public void each_product_should_display_its_correct_price() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user selects {string} from the sort dropdown")
	public void user_selects_from_the_sort_dropdown(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("products should be displayed in alphabetical order")
	public void products_should_be_displayed_in_alphabetical_order() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("products should be displayed in reverse alphabetical order")
	public void products_should_be_displayed_in_reverse_alphabetical_order() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("products should be displayed in ascending order of price")
	public void products_should_be_displayed_in_ascending_order_of_price() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("products should be displayed in descending order of price")
	public void products_should_be_displayed_in_descending_order_of_price() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on a product name")
	public void user_clicks_on_a_product_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("product details page should be displayed")
	public void product_details_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("product name should be displayed")
	public void product_name_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("product price should be displayed")
	public void product_price_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("product description should be displayed")
	public void product_description_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("product image should be displayed")
	public void product_image_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks Add to cart for {string}")
	public void user_clicks_add_to_cart_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the product should be added to the cart")
	public void the_product_should_be_added_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("cart badge should display {string}")
	public void cart_badge_should_display(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user adds {string} to the cart")
	public void user_adds_to_the_cart(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the button for {string} should change to {string}")
	public void the_button_for_should_change_to(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("{string} is added to the cart")
	public void is_added_to_the_cart(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks Remove for {string}")
	public void user_clicks_remove_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the product should be removed from the cart")
	public void the_product_should_be_removed_from_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("cart badge should not be displayed")
	public void cart_badge_should_not_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on the shopping cart icon")
	public void user_clicks_on_the_shopping_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be navigated to the Cart page")
	public void user_should_be_navigated_to_the_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Cart page should be displayed")
	public void cart_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
