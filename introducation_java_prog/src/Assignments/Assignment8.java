package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("uni");
	    driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
	    driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
	    driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
	    driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
	    driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
	    driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
	   // driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
	    driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value");
	}

}
