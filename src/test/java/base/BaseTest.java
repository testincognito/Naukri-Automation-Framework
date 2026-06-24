package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.DriverManager;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=DriverManager.getDriver();
		System.out.println("Browser Launched");
	}
	
	@AfterMethod
	public void teardown() {
		if(driver!=null) {
			driver.quit();
		}
System.out.println("Browser closed");
	}
	
	

}
