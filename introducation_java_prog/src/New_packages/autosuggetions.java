package New_packages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggetions {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");  
	    Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("in");
        Thread.sleep(1000);
        List<WebElement> listoption = driver.findElements(By.xpath("//input[@id='autosuggest']"));
        
        for(int i=0;i<listoption.size();i++)
        {
              String values = listoption.toString();
              System.out.println();
        }
        
        
        
        
//        for( WebElement options: listoption )
//        {
//        	if(options.getText().equalsIgnoreCase("Benin"))
//        	{
//        		options.click();
//        		break;
//        	}
//        }

	}

}
