package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.LoginPagePOMClass;

public class TestBaseClass
{
	 WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUpMethod(String browserName)
	{
		if(browserName.equals("chrome"))
		{
		  System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chromedriver.exe");
		  driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Chrome\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("Window is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url is opened");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		LoginPagePOMClass log = new LoginPagePOMClass(driver);
		log.sendUserName();
		System.out.println("User name entered");	
		log.sendPassword();
		System.out.println("Password entered");
		log.clickLoginButton();
		System.out.println("Login successfully");
		
		
	}	
	
	@AfterMethod
	 public void tearDown()
	  {
		driver.quit();
		System.out.println("Browser is closed");
	  }

}



