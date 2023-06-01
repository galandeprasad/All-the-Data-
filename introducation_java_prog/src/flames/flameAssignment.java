package flames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flameAssignment {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://the-internet.herokuapp.com/nested_frames");
	    int sizes = driver.findElements(By.tagName("frame")).size();
	    //System.err.println(sizes);
	    driver.switchTo().frame(0);
	    
	   // System.out.println(driver.findElements(By.tagName("frame")).size());
	    
	    WebElement frames = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
	    driver.switchTo().frame(frames);
	    System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
	    driver.switchTo().defaultContent();
	   
	    
	}

}
