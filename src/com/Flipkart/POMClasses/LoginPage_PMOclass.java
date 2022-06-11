package com.Flipkart.POMClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PMOclass 
{
	private WebDriver driver;
		
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement cancelbutton;
	
	public void cancelbuttonMethod()
	{
		cancelbutton.click();
	}
	
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login;
	
	public void loginMethod()
	{
		login.click();
	}
	
	@FindBy(xpath="//span[text()='Enter Email/Mobile number']/../..//input")
	private WebElement username;
	
	public void sendusername()
	{
		username.sendKeys("9890085073"+Keys.ENTER);
	}
	

	@FindBy(xpath="//span[text()='Enter Password']/../..//input")
	private WebElement password;
	
	public void sendpassword()
	{
		password.sendKeys("Komal@123"+Keys.ENTER);
	}
	
	@FindBy(xpath="//span[text()='Enter Password']/../..//input")
	private WebElement login1;
	
	public void login1Method()
	{
		login1.click();
	}

	
	public LoginPage_PMOclass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	

}
