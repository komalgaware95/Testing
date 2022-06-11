package practice;

import org.testng.annotations.Test;

public class TestNG_Keywords 
{
	
	@Test (priority = -1)
	
	public void methodA()
	{
		System.out.println("Method A");
	}

	@Test  (priority = -2)
	public void methodB()
	{
		System.out.println("Method B");
	}
    
	@Test (priority = 1)
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
