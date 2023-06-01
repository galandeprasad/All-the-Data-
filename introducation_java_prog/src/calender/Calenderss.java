package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderss {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companion/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Date of travel']")).click();
        Thread.sleep(1000);
        List<WebElement> days = driver.findElements(By.cssSelector("[class='flatpickr-rContainer'] [class='dayContainer']"));
	    for(int i=0;i<days.size();i++)
	    {
	    	String values = days.get(i).getText();
	    	System.out.println(values);
	    }
	}

}
