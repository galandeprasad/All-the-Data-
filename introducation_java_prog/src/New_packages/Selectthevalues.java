package New_packages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectthevalues {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	   driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	   List<WebElement> values = driver.findElements(By.xpath("//h4[@class='product-name']"));
	   
	   for(int i=0;i<values.size();i++)
	   {
		   String Text = values.get(i).getText();
		   //System.out.println(Text);
		   if (Text.contains("Cucumber - 1 Kg"))
		   {
			   driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
			   break;
		   }
	    }
	   driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	   

    }
}	
