package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.CartPagePOMClass;
import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;

import junit.framework.Assert;

public class TC03ProductAddedToCartOrNot extends TestBaseClass
{
	
		@Test 
		 public void productAddedToCart()
		{
		//Home page
		 HomePagePOMClass  hp = new  HomePagePOMClass(driver);
		 hp.addtocartButton();
		 System.out.println("Clicked on add to cart button");
		 String actualResult = hp.getTextFromCart();
		 System.out.println(actualResult);
		 String expectedResult="1";
        
		
		Assert.assertEquals(actualResult, expectedResult);
		
	}
	

}
