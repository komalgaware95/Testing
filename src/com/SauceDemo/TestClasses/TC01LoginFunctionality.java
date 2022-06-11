package com.SauceDemo.TestClasses;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.LoginPagePOMClass;



public class TC01LoginFunctionality extends TestBaseClass
{
	
		//Login fuctionality
		@Test
		public  void loginFunctionality()
	{
		
		
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		
		//Hard assert
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
		
			

}
