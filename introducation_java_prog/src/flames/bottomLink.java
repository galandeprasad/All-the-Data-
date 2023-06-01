package flames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bottomLink {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice");
	    System.out.println(driver.findElements(By.tagName("a")).size());
	    //buttom of page
	    System.out.println("Total number of link in the buttom");
	    WebElement buttompage = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
	    System.out.println(buttompage.findElements(By.tagName("a")).size());
	    //count the specifice column
	     WebElement newdriver = buttompage.findElement(By.xpath("//tbody/tr[1]/td[1]/ul[1]"));
	     System.out.println(newdriver.findElements(By.tagName("a")).size());
	     for(int i=1;i<newdriver.findElements(By.tagName("a")).size();i++)
	     {
	    	 String clicklink = Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	 buttompage.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
	    	 
	    	 Set<String> Win = driver.getWindowHandles();
	    	 Iterator<String> values = Win.iterator();
	    	/* while(values.hasNext())
	    	 {		 
	    	  driver.switchTo().window(values.next());
	    	  System.out.println( driver.getTitle());
	    	  
	    	 }*/
	    	 
	     }
	     

	}

}
