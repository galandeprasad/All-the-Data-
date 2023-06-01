package New_packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignmentnumber1 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	    Thread.sleep(1000);
	    boolean values = driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
	    System.out.println(values);
	    Assert.assertTrue(true, "driver.findElement(By.xpath(\"//input[@id='checkBoxOption1']\")).isSelected()");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        Thread.sleep(1000);
        boolean dis = driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
        System.out.println(dis);
        Assert.assertTrue(true, "driver.findElement(By.xpath(\"//input[@id='checkBoxOption1']\")).isSelected()");
        
	}

}
