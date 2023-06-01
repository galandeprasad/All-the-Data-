package Treeni.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Treeni.qa.Base.BasePage;

public class LoginPage extends BasePage
{
   
	
	public LoginPage() throws Exception
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='inputEmail']")
	WebElement Username;
	@FindBy(xpath = "//input[@id='inputPassword']")
	WebElement Password;
	@FindBy(xpath = "//button[@title='Login']")
	WebElement Login;
	@FindBy(xpath ="//img[@class='client_logo_img']")
	WebElement Logo;
	@FindBy(xpath = "//a[@class='left client-logo brand-logo mt-1_35']")
	WebElement ClientLogo;

	public String ValidateGetTitle()
	{
		return driver.getTitle();
	}
	
	public boolean ImageCheck()
	{
		return ClientLogo.isDisplayed();
	}
	
	public Landingpage Login(String un,String pass)
	{
		Username.sendKeys(un);
		Password.sendKeys(pass);
		Login.click();
		
		return new Landingpage();
	}
	
	
}
