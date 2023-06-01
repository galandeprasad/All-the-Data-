package Treeni.ExtendReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
	ExtentReports extend;

	@BeforeTest
	public void Configure()
	{
		String Filepath = System.getProperty("user.dir")+"\\reports\\indexs.html";
		ExtentSparkReporter reports=new ExtentSparkReporter(Filepath);
		reports.config().setReportName("Prasad Reports");
		reports.config().setDocumentTitle("Prasad Test");
		
	    extend= new ExtentReports();
		extend.attachReporter(reports);
		extend.setSystemInfo("Tester", "Prasad galande");
		
		
	}
	
	
	@Test
	public void initation()
	{
		extend.createTest("initation");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://utcltest.resustain.io/users/sign_in#/");
		System.out.println(driver.getTitle());
		driver.close();
		extend.flush();
		
	}
	
	
}