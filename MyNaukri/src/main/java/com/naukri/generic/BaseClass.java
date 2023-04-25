package com.naukri.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.naukri.pom.HomePage;
import com.naukri.pom.LoginClass;

public class BaseClass {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./src\\main\\resources/driver/chromedriver.exe");
	}
	
	public WebDriver driver;
	
	@BeforeTest
	public void openBrowser() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	@BeforeMethod
	public void loginNaukri() throws Throwable {
		FileLib f = new FileLib();
		String url = f.naukriCred("url");
		String un = f.naukriCred("un");
		String pw = f.naukriCred("pw");
		
		driver.get(url);
		
		LoginClass l = new LoginClass(driver);
		l.getHomeLoginBtn().click();
		l.getUserName().sendKeys(un);
		l.getPassword().sendKeys(pw);
		l.getLoginBtn().click();
	}
	
	@AfterMethod
	public void logOutNaukri() {
		HomePage h = new HomePage(driver);
		h.getLoBtn().click();
		h.getLogOutBtn().click();
		
	}

}
