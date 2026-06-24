package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.waitHelper;

public class LoginPage extends BasePage {
	
	
	
	private By loginButton=By.xpath("//a[text()='Login']");
	private By emailField=By.xpath("//input[@placeholder='Enter your active Email ID / Username']");
	private By passwordFiled=By.xpath("//input[@placeholder='Enter your password']");
	private By submitButton =By.xpath("//button[@type='submit']");
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	 public void clickLogin() {
		 System.out.println("Clicking Login Button");


	        driver.findElement(loginButton).click();

}
	 
	 public void enterEmail(String email) {
		 
		 waitHelper.waitForVisibility(driver, emailField);
		 
		 driver.findElement(emailField).sendKeys(email);
		
	 }
	 
	 public void enterPassword(String password) {
		 waitHelper.waitForVisibility(driver,passwordFiled );
		 driver.findElement(passwordFiled).sendKeys(password);
		 
	 }
	 
	 public void clickSubmit() {
		 
		 waitHelper.waitForVisibility(driver,submitButton );
		 
		 driver.findElement(submitButton).click();
		 
	 }
	 
	 public void login(String username , String password) throws InterruptedException {
		 
		 clickLogin();
		 enterEmail(username);
		 enterPassword(password);
		 clickSubmit();
		 
		 
	 }
}
