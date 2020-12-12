package com.ups.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpsDriver {

	public WebDriver getChromeDriver() {
		WebDriverManager.chromedriver().browserVersion("87.0.4280.88").setup();
		WebDriver driver = new ChromeDriver();
		return driver;
	}


}


