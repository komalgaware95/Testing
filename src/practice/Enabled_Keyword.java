package practice;

import org.testng.annotations.Test;

public class Enabled_Keyword
{
@Test (enabled = false)           //will not be executed it will be avoided
	
	public void methodA()
	{
		System.out.println("Method A");
	}

	@Test  
	public void methodB()
	{
		System.out.println("Method B");
	}
    
	@Test (enabled = false)  
	public void methodC()
	{
		System.out.println("Method C");
	}
    
	@Test  (invocationCount = 2) 
	public void methodD()
	{
		System.out.println("Method D");
	}

}
