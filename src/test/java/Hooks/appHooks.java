package Hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import QA.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class appHooks {
	
	WebDriver driver;
	
	DriverFactory df;
	
	@Before
	public void LaunchBrowser() throws IOException {
		FileInputStream File = new FileInputStream("C:\\Users\\spgit\\OneDrive\\Software testing_Target\\Automation_Projects\\Sauce_Lab_BDD_framework\\src\\test\\resources\\config.properties");
		
		Properties prop = new Properties();
		
		prop.load(File);
		
		String BrowserName = prop.getProperty("Browser");
		
		 df = new DriverFactory();
		 
		 driver = df.initBrowser(BrowserName);
		 
		 driver.manage().window().maximize();
		
		
	}
	
	@After
	public void teardown() {
		
		driver.quit();
	}
	
	@AfterStep
	public void postactions(io.cucumber.java.Scenario SC)  {
		
		if(SC.isFailed()) {
			
			byte[] Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			
			SC.attach(Screenshot, "image/png", Screenshot.toString());
		}
		
		 
		
	}

}
