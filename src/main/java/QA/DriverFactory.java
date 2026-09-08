package QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	static WebDriver driver;
	
	public WebDriver initBrowser(String Browser) {
		
		if(Browser.equals("Chrome")) {
			
			driver= new ChromeDriver();
		}
		else if(Browser.equals("Firefox")) {
			
			driver= new FirefoxDriver();
		}
		
		return driver;
	}
	
   public static WebDriver getdriver() {
	   
	   return driver;
   }
}
