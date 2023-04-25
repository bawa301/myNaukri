package com.naukri.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass
{
	@FindBy (xpath = "//a[text()='Login']")
	private WebElement HomeLoginBtn;
	
	@FindBy (xpath = "//input[@placeholder='Enter your active Email ID / Username']")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@placeholder='Enter your password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[text()='Login']")
	private WebElement loginBtn;
	
	public LoginClass(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getHomeLoginBtn() {
		return HomeLoginBtn;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	

}
