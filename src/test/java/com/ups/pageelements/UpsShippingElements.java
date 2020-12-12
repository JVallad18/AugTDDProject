package com.ups.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsShippingElements {

	WebDriver driver = null;

	public UpsShippingElements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement Country() {

		WebElement Country = driver.findElement(By.xpath("//*[@id=\'origin-cac_country\']"));
		return Country;
	}

	public WebElement Name() {
		WebElement name = driver.findElement(By.xpath("//*[@id=\'origin-cac_companyOrName\']"));
		return name;
	}

	public WebElement Address() {
		WebElement Address = driver.findElement(By.xpath("//*[@id=\'origin-cac_singleLineAddress\']"));
		return Address;
	}

	public WebElement Email() {
		WebElement Email = driver.findElement(By.xpath("//*[@id=\'origin-cac_email\']"));
		return Email;
	}

	public WebElement Phone() {
		WebElement Phone = driver.findElement(By.xpath("//*[@id=\'origin-cac_phone\']"));
		return Phone;

	}
	
	public WebElement ContinueBtn() {
		WebElement ContinueBtn = driver.findElement(By.xpath("//*[@id=\'nbsBackForwardNavigationContinueButton\']"));
		return ContinueBtn;
		
	}
	
	
	
}
