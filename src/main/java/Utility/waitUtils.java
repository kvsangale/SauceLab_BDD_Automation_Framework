package Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitUtils {
	//we will write the wait methods here
	//First we will declare the WebDriver and WebDriverWait
	
	WebDriver driver;
	WebDriverWait wait;
	
	public waitUtils(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
	}
	
	public WebElement waitForVisibility(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public WebElement waitForClickability(WebElement element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public Alert waitForAlert() {
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	public boolean waitForTitle(String title) {
		return wait.until(ExpectedConditions.titleIs(title));
	}
	public boolean waitForUrl(String url) {
	return	wait.until(ExpectedConditions.urlToBe(url));
	}
	
}
