package NewLoctors;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenshot {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/angularpractice");
	    WebElement Elements = driver.findElement(By.xpath("//input[@minlength='2']"));
	    Elements.sendKeys("Prasad");
	    File Fls = Elements.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(Fls, new File("Logo.png"));
        System.out.println(Elements.getRect().getDimension().getHeight());
        System.out.println(Elements.getRect().getDimension().getWidth());
        driver.quit();
	}

}
