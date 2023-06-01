package New_packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class insecuredPage {

	public static void main(String[] args) 
	{
		//ssl cretificate programs(With out http and https web side only)
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
	    System.out.println(driver.getTitle());
	}

}
