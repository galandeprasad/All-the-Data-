package New_packages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignmentnumber3 {

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/angularpractice/");
	    driver.findElement(By.xpath("//input[@minlength='2']")).sendKeys("prasad galande");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("galande.prasad@gmail.com");
	    driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Prasad@123");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='form-check']")).click();
	    driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
	    driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("06-01-1998");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
	    Thread.sleep(1000);
	    String text = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
	    System.out.println(text);
	    
	    Assert.assertEquals(text,"Success! The Form has been submitted successfully!.");
	    
	    
	    
	
	}
}
