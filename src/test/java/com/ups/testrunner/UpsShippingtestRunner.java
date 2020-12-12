package com.ups.testrunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import com.ups.driver.UpsDriver;
import com.ups.pageactions.UpsShippingActions;
import com.ups.pageelements.UpsShippingElements;

public class UpsShippingtestRunner extends UpsDriver {

	WebDriver driver;
	
	UpsShippingActions ShippingPage;
	
	@BeforeMethod
void ChromedriverMethod() {
	this.driver = getChromeDriver();
	this.ShippingPage = new UpsShippingActions(driver);
	driver.get("https://www.ups.com/ship/guided/origin?tx=9780687867961756&loc=en_US");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
void Shippingtest() {
	ShippingPage.Country();
	ShippingPage.
	
}
	

	
	
	
}
