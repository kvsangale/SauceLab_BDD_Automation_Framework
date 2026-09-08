package POM_Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class productsPage {
	
	WebDriver driver;
	
	//	@FindBy() private WebElement 
	
	@FindBy(xpath="//span[text()='Products']") private WebElement productsTitle;
	@FindBy(xpath="//div[@class='inventory_item_name ']") private List<WebElement> allProducts ;
	@FindBy(xpath="//div[@data-test='inventory-item-name']") private List<WebElement> allProductsNames; 
	@FindBy(xpath="//div[@class='inventory_item_price']") private List<WebElement> allProductsPrices;
	@FindBy(xpath="//button[text()='Add to cart']") private List<WebElement> alladdToCartBtn;
	@FindBy(xpath="//span[text()='Name (A to Z)']") private WebElement AtoZFilter;
	@FindBy(id="back-to-products") private WebElement productDetailsPage;
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']") private WebElement BackpackTitle;
	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']") private WebElement BikeLightTitle;
	@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']") private WebElement BoltTshirtTitle;
	@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']") private WebElement FleeceJacketTitle;
	@FindBy(xpath="//div[text()='Sauce Labs Onesie']") private WebElement OnesieTitle;
	@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']") private WebElement RedTshirtTitle;
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement dropDownFilter;
	
	
	
public productsPage(WebDriver driver) {
	
	this.driver = driver;
	
	PageFactory.initElements( driver, this);
	
   }

public String getPageTitle() {
	
	String title = productsTitle.getText();
	return title;
    }
public boolean isDisplayedProductPage() {
	
	String pageTitle = driver.getTitle();
	
	if(pageTitle.equals("Products")) {
		
		System.out.println("Products page is displayed");
	}
	
	return true;
}
public List<String> getAllProducts(){
	
	List<String> productList = new ArrayList<String>();
	for(WebElement product : allProducts) {
		
		String productTitle= product.getText();
		
		productList.add(productTitle);
	  }
	
	  return productList;
	
    }
public List<String> getAllProductNames(){
	
	  List<String> names = new ArrayList<String>();
	  
	  for(WebElement name : allProductsNames) {
		  
		  String text = name.getText();
		  names.add(text);
	   }
	  return names;
   }
public List<String> getAllProductprices(){
	
	List<String> prices = new ArrayList<String>();
	
	for(WebElement price : allProductsPrices) {
		
		String priceText = price.getText();
		
		prices.add(priceText);
	 }
	
	   return prices;
    }
public int getAllAddToCartBtn(){
	
	List<String> addtocartButtons = new ArrayList<String>();
	
	for(WebElement addToCartBtn : alladdToCartBtn) {
		
		String textAddtocart = addToCartBtn.getText();
		addtocartButtons.add(textAddtocart);
		
	}
	return addtocartButtons.size();
	
   }
public List<String> checkPriceOfEachProduct() {
	
	List<String> priceList = new ArrayList<String>();
	
	for(WebElement eachPrice : allProductsPrices ) {
		
		if(eachPrice.isDisplayed()) {
			
			String Pr = eachPrice.getText();
			
			priceList.add(Pr);
		 }
	   }
	 return priceList;
    }

public String selectAtoZNameOptionfromDD() {
	
	Select sel = new Select(dropDownFilter);
	
	sel.selectByVisibleText(("Name (A to Z)"));
	WebElement OptionSelected = sel.getFirstSelectedOption();
	
	String optionText= OptionSelected.getText();
	
	return optionText;
 }

public String selectZtoANameOptionfromDD() {
	
	Select sel = new Select(dropDownFilter);
	
	sel.selectByVisibleText(("Name (Z to A)"));
	
	WebElement AnotherOptionSelected = sel.getFirstSelectedOption();
	
	String optionText= AnotherOptionSelected.getText();
	
	return optionText;
 }
public boolean checkProductsAreInAlphabeticalOrder() {
	
	List<String> actualProductList = new ArrayList<String>(); 
	
	for(WebElement product: allProductsNames ) {
		
		String ProductNameText = product.getText();
		
		actualProductList.add(ProductNameText);
		
	}
	List<String> sortedProductList = new ArrayList<String>(actualProductList);
	
	Collections.sort(sortedProductList);
	
	return actualProductList.equals(sortedProductList);
 }

public boolean checkProductsAreInReverseAlphabeticalOrder() {
	
	List<String> actualProductList = new ArrayList<String>(); 
	
	for(WebElement product: allProductsNames ) {
		
		String ProductNameText = product.getText();
		
		actualProductList.add(ProductNameText);
		
	}
	List<String> sortedProductList = new ArrayList<String>(actualProductList);
	
	Collections.reverse(sortedProductList);
	
	return actualProductList.equals(sortedProductList);
 }
}





















