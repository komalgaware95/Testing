package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_Info_POMClass 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement  fname ;
	
	public void firstName()
	{
		fname.sendKeys("Komal");
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement  lname ;
	
	public void lastName()
	{
		lname.sendKeys("Gaware");
	}
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement  zipcode ;
	
	public void zipCode()
	{
		zipcode.sendKeys("412208");
	}
	
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement  continu ;
	
	public void continueButton()
	{
		continu.click();
	}
	
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement  cancel ;
	
	public void cancelButton()
	{
		cancel.click();
	}

	public Customer_Info_POMClass (WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
}
