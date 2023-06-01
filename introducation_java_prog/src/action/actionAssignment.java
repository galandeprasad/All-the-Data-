package action;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actionAssignment {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://the-internet.herokuapp.com/windows");
	    driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
	    Set<String> win = driver.getWindowHandles();
	    Iterator<String> it = win.iterator();
	    String firstWin = it.next();
	    //System.out.println(firstWin);
	    String secondWin = it.next();
	    //System.out.println(secondWin);
	    driver.switchTo().window(secondWin);
	    System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
	    driver.switchTo().window(firstWin);
	    System.out.println(driver.findElement(By.xpath("//h3")).getText());
	    
		

	}

}
