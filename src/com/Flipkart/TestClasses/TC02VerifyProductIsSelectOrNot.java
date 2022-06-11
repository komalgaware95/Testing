package com.Flipkart.TestClasses;

import org.testng.annotations.Test;

import com.Flipkart.POMClasses.Select_Product_PMOclass;

public class TC02VerifyProductIsSelectOrNot  extends TestBaseClass
{
	
	@Test (priority = -1)
	
	public void verifyProductIsSelect()
	{
		Select_Product_PMOclass s= new  Select_Product_PMOclass(driver);
		s.selectAppliances();
		System.out.println("Apliances option selcted");
		
		s.selectAC();
		System.out.println("AC option selected");
		
		s.selectTypesofAC();
		System.out.println("Inverter Ac selected");
		
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
//		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
//		
//		if(expectedTitle.equalsIgnoreCase(actualtitle))
//		{
//			System.out.println("Test case is passed");
//			
//		}
//		else
//		{
//			System.out.println("Test case is failed");
//			
//		}
		
	}

}
