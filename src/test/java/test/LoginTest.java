package test;

import org.testng.annotations.Test;

import base.BaseTest;
import config.ConfigReader;
import pages.LoginPage;



public class LoginTest extends BaseTest {
	
	@Test
	public void openNaukri() throws InterruptedException {
		
		
		driver.get(ConfigReader.getProperty("url"));
		driver.manage().window().maximize();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
		
	    System.out.println("Login Successfull");
		
		
		Thread.sleep(2000);
		
		
		
		
	
				
			
		
		
	}
	
	

}
