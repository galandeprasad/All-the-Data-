package New_packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShetly {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    //   driver.close();   throwing error 
	    driver.quit();

	}

}