package Assignments;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCount {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		int sumvalues=0;
		List<WebElement> colValues = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		for(int i=0;i<colValues.size();i++)
		{
			String values =colValues.get(i).getText();
			int number =Integer.parseInt(values);
			sumvalues=sumvalues+number;
		
		}
		System.out.println(sumvalues);
			
		
		
	}

}
