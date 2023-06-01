package testda;

import org.testng.Assert;
import org.testng.annotations.*;
public class checkAnnotatation 
{

	
	@Test(priority = 3)
	public void Test1()
	{
		System.out.println("test 1");
	}
	@Test(priority = 2)
	public void Test2()
	{
		System.out.println("test 2");
	}
	@Test(priority = 1)
	public void Aest()
	{
		System.out.println("Run First");
	}
	@BeforeMethod
	public void BeforeMethodd()
	{
		System.out.println("before Method");
		
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	@BeforeTest
    public void beforeTest() 
	
    {
    	System.out.println("before test");
    }
	
	
}
