package introducation_java_prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclasss {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
		
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://www.Google.com");


	}

}
