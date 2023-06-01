package test.testprojectMavelss.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testprojectMavelss.AbstactCompent.abstactComponts;

public class Landingpage extends abstactComponts
{
    WebDriver driver;
    
	public Landingpage (WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement Password;
	
	@FindBy(id="login")
	WebElement Loing;
	
	
	
	public void loginApp(String Email,String Pass)
	{
		
		userEmail.sendKeys(Email);
		Password.sendKeys(Pass);
		Loing.click();
	}
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	
}
