package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testdata {

	@Test
	public void testcases()
	{
		System.out.println("Prasad");
	}
	
	@Test
	public void testcases2()
	{
		System.out.println("Galande");
	}
	@BeforeSuite
	public void Bsuite()
	{
		System.out.println("Bsuite");
	}
	@Test(groups = {"Prasad"})
	public void testcases6()
	{
		System.out.println("testcase6");
	}
	@Test
	public void testcases7()
	{
		System.out.println("testcase7");
	}

}
