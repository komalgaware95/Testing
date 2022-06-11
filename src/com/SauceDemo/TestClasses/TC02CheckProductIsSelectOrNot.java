package com.SauceDemo.TestClasses;






import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;



public class TC02CheckProductIsSelectOrNot extends TestBaseClass
{
	
		@Test
		public void checkProductIsSelected()
	{
		//Home page
		 HomePagePOMClass  hp = new  HomePagePOMClass(driver);
		 hp.addtocartButton();
		 System.out.println("Clicked ");
		 
		 String expectedtitle="Swag Labs";
		 String actualTitle=driver.getTitle();
		 
		 Assert.assertEquals(actualTitle, expectedtitle);
	}
		
		
}
