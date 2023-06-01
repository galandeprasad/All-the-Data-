package Treeni.qa.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Treeni.qa.Base.BasePage;
import Treeni.qa.pages.Landingpage;
import Treeni.qa.pages.LoginPage;

public class LoginTestCa extends BasePage
{
	LoginPage lp;
	Landingpage ldp;
	public LoginTestCa() throws Exception 
	{
		super();
		
	}

	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		lp=new LoginPage();
	
	}
	
	@Test(priority = 1)
	public void validatePageTitle()
	{
		String TitleText = lp.ValidateGetTitle();
		Assert.assertEquals(TitleText, "Treeni");
	}
	
	@Test(priority = 2)
	public void validateLog()
	{
		boolean flag = lp.ImageCheck();
		Assert.assertTrue(flag);
		
	}
	@Test(priority = 3)
	public void logintest()
	{
		ldp = lp.Login(pro.getProperty("Username"), pro.getProperty("Password"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
