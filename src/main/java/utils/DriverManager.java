package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	public static WebDriver getDriver() {
		
		String browser=ConfigReader.getProperty("browser");
		
		if(browser.equalsIgnoreCase(ConfigReader.getProperty("browser"))) {
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		}
		
		throw new RuntimeException(
                "Invalid Browser: " + browser);
		
		

	}

}
