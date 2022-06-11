package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOMClass
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[text()='Remove']")
	private WebElement removeButton;
	
	public void removeButton()
	{
	
		removeButton.click();
	}
	

	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement checkoutButton;
	
	public void checkoutButton()
	{
	
		checkoutButton.click();
	}
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement continueShopping;
	
	public void continueShopping()
	{
	
		continueShopping.click();
	}
	
	public CartPagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
}
