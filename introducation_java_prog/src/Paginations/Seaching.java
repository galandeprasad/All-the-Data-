package Paginations;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seaching {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	    driver.findElement(By.xpath("//th[@aria-sort='descending']")).click();
	     //after click on descending order
	     List<WebElement> Values = driver.findElements(By.xpath("//tbody/tr/td[1]"));
	     //values 
	     List<String> ss = Values.stream().map(s->s.getText()).collect(Collectors.toList());
	     ss.forEach(s->System.out.println(s));
	     
	    //Sorting
	         List<String> SortedList = ss.stream().sorted().collect(Collectors.toList());
	         List<String> Prices;
	  do {
	    	   
	       
	    	List<WebElement> Rowsvalue = driver.findElements(By.xpath("//tbody/tr/td[1]"));
	        Prices = Rowsvalue.stream().filter(s->s.getText().contains("Guava")).map(s->Pvalues(s)).collect(Collectors.toList());
	        Prices.forEach(s->System.out.println(s));
	        
	        if(Prices.size()<1)
	        {
	        	driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
	        }
	  }
	  while(Prices.size()<1);
	  
	  
	  driver.quit();
	  
	}
	
	private static String Pvalues(WebElement s)
	{
		  String RowP = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		 return RowP;
	}

}
