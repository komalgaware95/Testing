package practice;

import org.testng.annotations.Test;

public class TimeOut_Keyword 
{
	@Test (timeOut = 1000) 
	public void methodA() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Method A");
	}

	@Test  
	public void methodB()
	{
		System.out.println("Method B");
	}
    
	@Test
	public void methodC()
	{
		System.out.println("Method C");
	}
    
	@Test  
	public void methodD()
	{
		System.out.println("Method D");
	}

}
