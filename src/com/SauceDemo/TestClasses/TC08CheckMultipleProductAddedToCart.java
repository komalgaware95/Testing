package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;

import junit.framework.Assert;

public class TC08CheckMultipleProductAddedToCart  extends TestBaseClass
{
	@Test
	
	public void addMultipleProduct()
	{
		
		
		//Home page
		HomePagePOMClass  hp = new  HomePagePOMClass(driver);
		hp.addMultipleProduct();
		System.out.println("All product added to cart");
		
		String actualResult = hp.getTextFromCart();
		 System.out.println(actualResult);
		 String expectedResult="6";
       
		
		Assert.assertEquals(actualResult, expectedResult);
		
		
		
	}

}
