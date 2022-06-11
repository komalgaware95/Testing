package com.Flipkart.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Flipkart.POMClasses.LoginPage_PMOclass;

public class TestBaseClass
{
	 WebDriver driver;
		@BeforeMethod
		public void setUpMethod()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Browser is opened");
			driver.manage().window().maximize();
			System.out.println("Window is maximized");
			driver.get("https://www.flipkart.com/");
			System.out.println("Url is opened");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			LoginPage_PMOclass  l = new LoginPage_PMOclass(driver);
			l.cancelbuttonMethod();
			System.out.println("Window closed");
			l.loginMethod();
			l.sendusername();
			System.out.println("Username entered");
			l.sendpassword();
			System.out.println("Password entered");
			l.login1Method();
			System.out.println("Login successfully");
            
			
		}
		
		
		@AfterMethod
		 public void tearDown()
		  {
			driver.quit();
			System.out.println("Browser is closed");
		  }

}
