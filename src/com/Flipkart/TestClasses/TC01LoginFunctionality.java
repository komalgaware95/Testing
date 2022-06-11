package com.Flipkart.TestClasses;

import org.testng.annotations.Test;

public class TC01LoginFunctionality extends TestBaseClass
{

	@Test
	
	public void checkLoginFunctionality()
	{
		
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failes");
		}
		
	}
}
