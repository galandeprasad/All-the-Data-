package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	private static final JavascriptExecutor JavascriptExcutor = null;

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)");
		//Row count
		int rowsize = driver.findElements(By.cssSelector(".table-display th")).size();
	    System.out.println("Row Count is:"+rowsize);
		//Row Names are
	    List<WebElement> Values = driver.findElements(By.cssSelector(".table-display th"));
        for(int i=0;i<Values.size();i++)
        {
        	String Names = Values.get(i).getText();
            System.out.println(Names);
        }
        
       // Column count
         int colCount = driver.findElements(By.cssSelector(".table-display tr")).size();
         System.out.println("Column count is:"+colCount);
         
        // Column Values
       List<WebElement> cval = driver.findElements(By.cssSelector(".table-display tr"));
       
     
       System.out.println(cval.get(2).getText()); 
       System.out.println(cval.get(3).getText());
         
         
       driver.quit();

	}

}
