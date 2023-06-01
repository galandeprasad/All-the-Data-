package NewLoctors;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsOpen {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/angularpractice");
	    Thread.sleep(1000);
	    driver.switchTo().newWindow(WindowType.TAB);
	    Set<String> Wins = driver.getWindowHandles();
	    Iterator<String> WinValues = Wins.iterator();
	    String Pwind =WinValues.next();
	    String Cwind = WinValues.next();
	    driver.switchTo().window(Cwind);
	    Thread.sleep(1000);
	    driver.get("https://rahulshettyacademy.com/");
	    String Values = driver.findElements(By.xpath("//a[@href='https://courses.rahulshettyacademy.com/p/learn-postman-for-api-automation-testing-with-javascript']")).get(1).getText();
	    driver.switchTo().window(Pwind);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys(Values);
	    
	    
	    
	    
	}

}
