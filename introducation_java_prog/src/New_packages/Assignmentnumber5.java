package New_packages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentnumber5 {

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
	    driver.findElement(By.xpath("(//label[@class='customradio'])[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
	    driver.findElement(By.xpath("//select[@class='form-control']")).click();
	    WebElement value = driver.findElement(By.xpath("//select[@class='form-control']"));
	    Select s=new Select(value);
	    s.selectByIndex(2);
	    driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
	    driver.findElement(By.xpath("//a[text()='iphone X']"));
	    List<WebElement> getvalues = driver.findElements(By.xpath("//h4[@class='card-title']"));
	    for(int i=0;i<getvalues.size();i++)
	    {
	    	 String texts = getvalues.get(i).getText();
	    	 System.out.println(texts);
	    	
	    }
	    
	    
	}

}
