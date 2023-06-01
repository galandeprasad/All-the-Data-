package Treeni.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Treeni.qa.TestUtil.TestUtilC;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage 
{
	public static WebDriver driver;	
	public static Properties pro;
   
	public BasePage() throws Exception 
   {
	Properties pro=new Properties();
	FileInputStream file=new FileInputStream("D:/workspace_selenium/DemoProjectNew/src/main/java/Treeni/qa/environment/Treeni.Properties");
   }
	
	@SuppressWarnings("deprecation")
	public static void initialization()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtilC.Page_Time_Out,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtilC.Implicit_Wait,TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));
	}
	
}
