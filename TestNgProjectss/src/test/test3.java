package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test3 
{
	@AfterClass
	public void testcases7()
	{
		System.out.println(" after class testcase7");
	}
	@Test(groups = {"Prasad"})
	public void testcases8()
	{
		System.out.println("testcase8");
	}
	@Test
	public void testcases9()
	{
		System.out.println("testcase9");
	}
	@BeforeClass
	public void testcases10()
	{
		System.out.println(" before class testcase10");
	}
	
	
}
