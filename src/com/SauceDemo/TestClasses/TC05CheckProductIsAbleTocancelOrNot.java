package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.CartPagePOMClass;
import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;

import junit.framework.Assert;

public class TC05CheckProductIsAbleTocancelOrNot  extends TestBaseClass
{
	@Test
	public void checkProductIsCancel()
	{
		
		//Home Page
		HomePagePOMClass  hp = new  HomePagePOMClass(driver);
		hp.addtocartButton();
		System.out.println("Product added");
		hp.addToCart();
		System.out.println("Clicked on cart");
		
		//Cart page
		CartPagePOMClass c= new CartPagePOMClass(driver);
		c.removeButton();
		System.out.println("Clicked on remove button");
		String actualResult = hp.getTextFromCart();
		String expectedResult ="";
		
		Assert.assertEquals(actualResult, expectedResult);
	}
	

}
