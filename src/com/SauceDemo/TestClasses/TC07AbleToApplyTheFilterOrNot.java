package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.UtilityClasses.ScreenShotClass;

import junit.framework.Assert;

public class TC07AbleToApplyTheFilterOrNot extends TestBaseClass
{
	@Test
	public void applyFilter() throws IOException
	{
		
		
		//Home Page
		HomePagePOMClass  hp = new  HomePagePOMClass(driver);
		hp.sortProductContainer();
		System.out.println("Clicked on filter");
		hp.optionsOfFilter();
		System.out.println("Option selected ");
	    String actualResult = hp.filterText();
	    String expectedResult="PRICE (LOW TO HIGH)";
	    
	    Assert.assertEquals(actualResult, expectedResult);
		ScreenShotClass.screenshot(driver);
	}

}
