package NewLoctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class test1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/angularpractice");
	    WebElement value = driver.findElement(By.xpath("//input[@minlength='2']"));
	    Thread.sleep(1000);
	    String textValue = driver.findElement(with(By.tagName("label")).above(value)).getText();
	    System.out.println(textValue);
	    driver.quit();
	    
	    
	}

}
