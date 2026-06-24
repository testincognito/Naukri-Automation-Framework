package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.waitHelper;

public class ProfilePage extends BasePage {

	
	
	private By viewprofile=By.xpath("//a[normalize-space()='View profile']");
	private By resumeupload=By.id("attachCV");
	
	public ProfilePage(WebDriver driver) {
		super(driver);
	}
	
	
	
	public void clickViewProfile() {
		System.out.println("Clicking View Profile");
		waitHelper.waitForVisibility(driver, viewprofile);
		driver.findElement(viewprofile).click();
	}
	
	public void uploadresume(String filepath) {
		System.out.println("Trying to upload Resume");
		waitHelper.waitForPresence(driver, resumeupload);
		driver.findElement(resumeupload).sendKeys(filepath);
		
	}
}
