package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='inventory-item-name']") private WebElement productName;
	@FindBy(xpath="//div[@class='inventory_details_price']") private WebElement productPrice;
	@FindBy(id="add-to-cart") private WebElement productAddToCart;
	@FindBy(xpath="//img=[@class'inventory_details_img']") private WebElement productImage;
	
	public productDetailsPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements( driver,this);
		
	}
	
  public boolean isProductNameDisplayed(String prodName) {
	  
	  if(productName.isDisplayed()) {
		  
		  return true;
	  }
	  
	  return false;
    }
  
  public boolean isProductPriceDisplayed(String prodPrice) {
	  
	  if(productPrice.isDisplayed()) {
		  
		  return true;
	  }
	  return false;
  }
  
  public boolean isProductAddToCartBtnDisplayed(String prodName) {
	  
	  if(productAddToCart.isDisplayed()) {
	     
		  return true;
	    
	  }
	  return false;  
  }
  
  public boolean isImageeOfEachProductDisplayed(String prodName ) {
	  
	  if(productImage.isDisplayed()) {
		  
		  return true;
	  }
	  
	  return false;
  }

}
