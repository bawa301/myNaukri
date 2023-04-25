package com.naukri.testScript;


import java.io.File;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.naukri.generic.BaseClass;
import com.naukri.pom.HomePage;
import com.naukri.pom.MyProfile;

@Listeners (com.naukri.generic.ListenersImplimentation.class)
public class DailyUpdate extends BaseClass
{
	@Test (priority = 0)
	public void update() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Home | Mynaukri"));
		
		String aResult = driver.getTitle();
		String eResult = "Home | Mynaukri";
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(aResult, eResult);
		
		HomePage h = new HomePage(driver);
		h.getLoBtn().click();
		h.getUpdateProfile().click();
		
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.titleContains("Profile | Mynaukri"));
		
		String acResult = driver.getTitle();
		String ecResult = "Profile | Mynaukri";
		
		s.assertEquals(acResult, ecResult);
		
		MyProfile m = new MyProfile(driver);
		File f = new File("./src\\test\\resources/data/Amit Debnath-QA Automation Test Engineer-3+.pdf");
		String absolutePath = f.getAbsolutePath();
		m.getUpdateCV().sendKeys(absolutePath);
		
		s.assertAll();
		
		
	}
}
