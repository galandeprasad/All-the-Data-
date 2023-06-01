package New_packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiple_browsers {

	public static void main(String[] args)
	{
	    // Mircosoft Edge browsers
		// System.setProperty("webdriver.edge.driver","D:/drivers/firefox/msedgedriver.exe");
		
		System.setProperty("webdriver.gecko.driver","D:/drivers/firefox/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
		driver.close();
	    
		


	}

}
