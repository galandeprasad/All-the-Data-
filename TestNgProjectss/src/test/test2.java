package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 
{
	@Test
	public void testcases3()
	{
		System.out.println("Natu");
	}
	@BeforeTest
	public void first()
	{
		System.out.println("First executed");
	}
	@AfterTest
	public void last()
	{
		System.out.println("last");
	}
	@AfterSuite
	public void Lsuite()
	{
		System.out.println("Lsuite");
	}
	@Test
	public void testcases4()
	{
		System.out.println("testcase4");
	}
	@Test(groups = {"Prasad"})
	public void testcases5()
	{
		System.out.println("testcase5");
	}

}
