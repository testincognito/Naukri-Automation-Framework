package test;

import org.testng.annotations.Test;

import config.ConfigReader;

public class ConfigTest {
	
	@Test
	public void readProperties() {
		System.out.println(ConfigReader.getProperty("browser"));
		System.out.println(ConfigReader.getProperty("url"));
	}

}
