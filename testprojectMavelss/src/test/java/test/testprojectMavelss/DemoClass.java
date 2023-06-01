package test.testprojectMavelss;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import test.testprojectMavelss.pageobject.Landingpage;
import test.testprojectMavelss.pageobject.productCatalog;

public class DemoClass {

	public static void main(String[] args) throws Exception 
	{
		String Productname="ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Landingpage lp=new Landingpage(driver);
		lp.goTo();
		lp.loginApp("adiraj@gmail.com", "Adiraj@123");
		productCatalog pc=new productCatalog(driver);
		List<WebElement> lists = pc.getProductList();
		pc.addProductToCart(Productname);
		
		
		
       
      
        
        
        
        

	}

}
