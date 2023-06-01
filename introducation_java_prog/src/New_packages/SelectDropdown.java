package New_packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:/drivers/108/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");  
	    Thread.sleep(1000);
	    WebElement selectvalue = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        Select s=new Select(selectvalue);
        s.selectByIndex(3);
        System.out.println(s.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        s.selectByVisibleText("AED");
        System.out.println(s.getFirstSelectedOption().getText());
        s.selectByValue("INR");
        System.out.println(s.getFirstSelectedOption().getText());
        
	    
	}

}
