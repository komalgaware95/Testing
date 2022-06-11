package com.Facebook.POMClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser opened");
		driver.manage().window().maximize();
		driver.get("https:\\facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}

}
