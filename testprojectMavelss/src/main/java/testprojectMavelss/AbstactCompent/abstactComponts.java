package testprojectMavelss.AbstactCompent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class abstactComponts 
{
	WebDriver driver;
	
	public abstactComponts(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void waitForProductToAppered(By Findby)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Findby));
	}
	
	public void WaitForProductDisappered(WebElement Ele)
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait1.until(ExpectedConditions.invisibilityOfAllElements(Ele));
	}

}
