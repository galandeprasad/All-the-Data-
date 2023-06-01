package Paginations;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkingValues {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	   
	    
	    //Capture the values
	     List<WebElement> Values2 = driver.findElements(By.xpath("//tbody/tr/td[1]"));
	     List<String> ss1 = Values2.stream().map(s->s.getText()).collect(Collectors.toList());
	     ss1.forEach(s->System.out.println(s));
	     System.out.println("----------------------------");
	     driver.findElement(By.xpath("//th[@aria-sort='descending']")).click();
	     //after click on descending order
	     List<WebElement> Values = driver.findElements(By.xpath("//tbody/tr/td[1]"));
	     List<String> ss = Values.stream().map(s->s.getText()).collect(Collectors.toList());
	     ss.forEach(s->System.out.println(s));
	    //Sorting
	     List<String> Sval = ss.stream().sorted().collect(Collectors.toList());
	     Sval.forEach(s->System.out.println(s));
	     Assert.assertTrue(ss.equals(Sval));
	     System.out.println("----------------------------");
	     
	     //Searching the values in the table
	    List<String> Prices = Values.stream().filter(s->s.getText().contains("Apple")).map(s->getPrice(s)).collect(Collectors.toList());
	    Prices.forEach(s->System.out.println(s));
	     
	     driver.quit();
	}

	private static String getPrice(WebElement s) 
	{
		String Pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return Pricevalue;
		
	}

}
