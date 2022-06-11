package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.CartPagePOMClass;
import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;

import junit.framework.Assert;

public class TC04CheckProductIsBuyOrNot extends TestBaseClass
{
	@Test
	public void checkProductBuyOrNot()
	{
		
		
		//Home page
		 HomePagePOMClass  hp = new  HomePagePOMClass(driver);
		 hp.addtocartButton();
		 System.out.println("Clicked on add to cart button");
		 hp.addToCart();
		 System.out.println("Product is added into cart");
		 
	  //add to cart page
		 CartPagePOMClass c= new CartPagePOMClass(driver);
		c.checkoutButton();
		System.out.println("Clicked on checkout button");
		
		String expectedUrl="https://www.saucedemo.com/checkout-step-one.html";
		String actualUrl= driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
	}

}
