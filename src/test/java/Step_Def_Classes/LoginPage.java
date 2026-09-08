package Step_Def_Classes;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import POM_Classes.loginPage;
import QA.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	
	loginPage login = new loginPage(DriverFactory.getdriver());
	
	@Given("User is on the Login page")
	public void user_is_on_the_login_page() {
	   
		WebDriver driver = DriverFactory.getdriver();
		driver.get("https://www.saucedemo.com/");
	}

	@Then("User should see the login page title")
	public void user_should_see_the_login_page_title() {
	 
		String Title = login.getTitle();
		Assert.assertEquals(Title, "Swag Labs");
	}

	@When("User Enters valid user name {string}")
	public void user_enters_valid_user_name(String UN) {

		login.enterUsername(UN);
		System.out.print("Username is entered successfully");
		
	}

	@When("User Enters valid password {string}")
	public void user_enters_valid_password(String PSW) {
	    
		login.enterPassword(PSW);
		System.out.print("Password is entered successfully");
	}

	@When("User Clicks on login button")
	public void user_clicks_on_login_button() {
	    
		login.clickOnLoginBtn();
		System.out.print("clicked on login button successfully");
	}

	@Then("User should see {string}")
	public void user_should_see(String PageTitle) {
	   
		String pageTitle = login.getTheproductPageTitle();
		
		Assert.assertEquals(pageTitle, PageTitle);
	}

}
