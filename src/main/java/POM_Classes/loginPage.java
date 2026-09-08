package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[text()='Swag Labs']") private WebElement loginpageTitle;
	@FindBy(id="user-name") private WebElement userName;
	@FindBy(id="password") private WebElement password;
	@FindBy(id="login-button") private WebElement loginBtn;
	@FindBy(xpath="//span[text()='Products']") private WebElement productPageTitle;
	
	public loginPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		
		String Title=loginpageTitle.getText();
		
		return Title;
	}
	public void enterUsername(String username) {
		
		userName.sendKeys(username);
	}
	public void enterPassword(String Password) {
		
		password.sendKeys(Password);
	}
	public void clickOnLoginBtn() {
		
		loginBtn.click();
	}
   public String getTheproductPageTitle() {
	   
	  String pagetitle = productPageTitle.getText();
	  
	  return pagetitle;
   }
}


