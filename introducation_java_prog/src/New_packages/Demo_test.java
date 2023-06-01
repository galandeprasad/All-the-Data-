package New_packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_test {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("prasad@treeni.com");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("Prasad@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-container']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("prasad");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("prasad@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9554223454");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("prasad@treeni.com");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		
		
		// 9834707834

	}

}
