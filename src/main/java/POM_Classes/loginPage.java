package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.waitUtils;

public class loginPage {
	
	WebDriver driver;
	waitUtils wait;
	
	@FindBy(xpath="//div[text()='Swag Labs']") private WebElement loginpageTitle;
	@FindBy(id="user-name") private WebElement userName;
	@FindBy(id="password") private WebElement password;
	@FindBy(id="login-button") private WebElement loginBtn;
	@FindBy(xpath="//span[text()='Products']") private WebElement productPageTitle;
	
	public loginPage(WebDriver driver) {
		
		this.driver = driver;
		this.wait = new waitUtils(driver);
		
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		
		String Title=loginpageTitle.getText();
		
		return Title;
	}
	public void enterUsername(String username) {
		
		wait.waitForVisibility(userName).sendKeys(username);
	}
	public void enterPassword(String Password) {
		
		wait.waitForVisibility(password).sendKeys(Password);
	}
	public void clickOnLoginBtn() {
		
		wait.waitForClickability(loginBtn).click();
	}
   public String getTheproductPageTitle() {
	   
	  String pagetitle = wait.waitForVisibility(productPageTitle).getText();
	  
	  return pagetitle;
   }
}


