package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass 
{
	
	private WebDriver driver;
	private Actions act;
	private Select s;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addtocartButton;
	public void addtocartButton()
	{
		act.click(addtocartButton).perform();
	}
	
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filter;
	
	public void sortProductContainer()
	{
		act.click(filter).perform();
	}

	
	
	@FindBy(xpath="//select[@class='product_sort_container']//option")
	private WebElement options;
	
	public void optionsOfFilter()
	{
		
		s.selectByVisibleText("Price (low to high)");
		System.out.println("Option selected");
		
	}
	
	@FindBy(xpath="//span[text()='Price (low to high)']")
	private WebElement filterText;
	
	public String filterText()
	{
		String text1 = filterText.getText();
		return text1;
	}
	
	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addTocart;
	
	public void addToCart()
	{
		act.click(addTocart).perform();
	}
	public String  getTextFromCart()
	{
		
		String totalProduct = addTocart.getText();
		return totalProduct;
		
	}
	
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement open_menu;
	
	public void openMenu()
	{
		open_menu.click();
	}
	
	
	@FindBy(xpath="//a[@id='about_sidebar_link']]")
	private WebElement aboutTab;
	
	public void aboutTab()
	{
		aboutTab.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logOut;
	
	public void log_Out()
	{
		logOut.click();
	}
	
	@FindBy(xpath="//a[@id='reset_sidebar_link']")
	private WebElement reset;
	
	public void resetAppState()
	{
		reset.click();
	}
	
	
	//multiple product
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> multpleProduct;
	
	public void addMultipleProduct()
	{
		//for each loop
		for(WebElement m :multpleProduct)
		{
			m.click();
		}
		
//		for(int i=0; i<multpleProduct.size(); i++)
//		{
//			multpleProduct.get(i).click();
//		}
	}
	
	
	
	
	public HomePagePOMClass(WebDriver driver)
	{
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
		s = new Select(filter);
	}
}
