package com.ups.pageactions;

import org.openqa.selenium.WebDriver;

import com.ups.pageelements.UpsShippingElements;


public class UpsShippingActions {

	UpsShippingElements ShippingPage = null;

	public UpsShippingActions(WebDriver driver) {

		this.ShippingPage = new UpsShippingElements(driver);

	}

	public void Country() {
		ShippingPage.Country().click();
	}

	public void InputName(String Name) {
		ShippingPage.Name().sendKeys(Name);
	}

	public void InputAddreess(String Address) {
		ShippingPage.Address().sendKeys(Address);
	}

	public void InputEmail(String Email) {
		ShippingPage.Email().sendKeys(Email);
	}
	
	public void InputPhone(String Phone) {
		ShippingPage.Phone().sendKeys(Phone);
	
	}

	public void clickContinueBtn() {
		ShippingPage.ContinueBtn().click();
	}
	
	
}
