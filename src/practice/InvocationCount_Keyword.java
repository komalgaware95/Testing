package practice;

import org.testng.annotations.Test;

public class InvocationCount_Keyword
{

	@Test (invocationCount = -1)
	
	public void methodA()
	{
		System.out.println("Method A");
	}

	@Test  (invocationCount = 0)
	public void methodB()
	{
		System.out.println("Method B");
	}
    
	@Test (invocationCount = 3)
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
