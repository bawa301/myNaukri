package com.naukri.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy (xpath = "//span[text()='Search jobs here']/../../..//div[@class='nI-gNb-drawer']")
	private WebElement loBtn;
	
	@FindBy (xpath = "//a[text()='Logout']")
	private WebElement logOutBtn;
	
	@FindBy (xpath = "//a[text()='View & Update Profile']")
	private WebElement updateProfile;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoBtn() {
		return loBtn;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

	public WebElement getUpdateProfile() {
		return updateProfile;
	}
	
	
}
