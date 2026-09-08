package Runner_Class;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "C:\\Users\\spgit\\OneDrive\\Software testing_Target\\Automation_Projects\\Sauce_Lab_BDD_framework\\src\\test\\resources\\SauceAppTests",
		
		glue =  {"Step_Def_Classes", "Hooks"},
		
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"}
		
		)
public class Runner_class extends AbstractTestNGCucumberTests {

}
