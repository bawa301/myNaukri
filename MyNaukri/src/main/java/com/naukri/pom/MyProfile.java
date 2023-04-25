package com.naukri.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfile {
	
	@FindBy (id="attachCV")
	private WebElement updateCV;
	
	public MyProfile(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUpdateCV() {
		return updateCV;
	}
	
	
}
