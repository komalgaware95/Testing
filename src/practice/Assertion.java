package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Assertion 
{
	//Soft Assert
	@Test
	public void loginMethod()
	{
		String actualTitle="  Labs";
		String expectedTitle="Swag Labs";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle);
		
		String actualurl="www.sauceDemo.com";
		String expectedurl="www.sauceDemo.com";
		
		soft.assertEquals(actualurl, expectedurl);
		soft.assertAll();
	}
	
//	@Test
//	public void logout()
//	{
//		Assert.assertTrue(true);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Hard Asert
//	@Test
//	public void loginMethod()
//	{
//		String actualTitle="  Labs";
//		String expectedTitle="Swag Labs";
//		
//		Assert.assertEquals(actualTitle, expectedTitle);
//		
//		
//		String actualurl="www.sauceDemo.com";
//		String expectedurl="www.sauceDemo.com";
//		
//		Assert.assertEquals(actualurl, expectedurl);
//		
//	}
//	
//	@Test
//	public void logout()
//	{
//		Assert.assertTrue(true);
//	}

}
