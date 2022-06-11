package com.Flipkart.POMClasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Select_Product_PMOclass 
{
	private WebDriver driver;
	private Actions act;
	private Select s;
	
		@FindBy(xpath="//div[text()='Appliances']")
		private WebElement appliances;
		
		public void selectAppliances()
		{
			act.moveToElement(appliances).perform();
		}
		
		@FindBy(xpath="(//a[@class='_6WOcW9'])[2]\")")
		private WebElement ac;
		
		public void selectAC()
		{
			act.moveToElement(ac).perform();
		}
		
		@FindBy(xpath="//a[@class='_6WOcW9 _3YpNQe']")
		private List<WebElement> typesofAC;
		
		public void selectTypesofAC()
		{
			for(int i=0; i<typesofAC.size(); i++)
			{
				if(typesofAC.get(i).getText().contains("Inverter ACs"))
				{
					
					typesofAC.get(i).click();
					break;
				}
			}
		}

    public   Select_Product_PMOclass(WebDriver driver)
      {
	     this.driver = driver;
	
	     PageFactory.initElements(driver, this);
         act = new Actions(driver);
   }
	


	

}
