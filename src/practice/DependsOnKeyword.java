package practice;

import org.testng.annotations.Test;

import junit.framework.Assert;


public class DependsOnKeyword 
{
	@Test
	public void loginMethod()
	{
		System.out.println("Login successful");
		
		
		Assert.assertTrue(false);        
	}
	
	@Test(dependsOnMethods = {"loginMethod"})
	public void selectProduct()
	{
		System.out.println("Product selected");
	}

}
