package test;

import org.testng.annotations.Test;

import base.BaseTest;
import config.ConfigReader;
import pages.LoginPage;
import pages.ProfilePage;

public class ResumeUpdate extends BaseTest {
	
	@Test
	public void updateResume() throws InterruptedException {
		driver.get(ConfigReader.getProperty("url"));
		driver.manage().window().maximize();
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.login(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));
		
		ProfilePage profilepage = new ProfilePage(driver);
		
		profilepage.clickViewProfile();
		profilepage.uploadresume(ConfigReader.getProperty("filepath"));
		Thread.sleep(10000);
	}

}
