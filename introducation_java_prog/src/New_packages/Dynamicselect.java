package New_packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicselect {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.spicejet.com/");  
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//div[contains(text(),'Chandigarh')])[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//div[contains(text(),'Jaipur')])[1]")).click();
	    Thread.sleep(1000);
	    
	    
	    driver.quit();
	}

}