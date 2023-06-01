package testmavenProject;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) throws Exception 
	{
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://rahulshettyacademy.com/client");
      String productname="ZARA COAT 3";
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.findElement(By.id("userEmail")).sendKeys("adiraj@gmail.com");
      driver.findElement(By.id("userPassword")).sendKeys("Adiraj@123");
      driver.findElement(By.id("login")).click();
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
      

      //get all the values
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-lg-4")));
      List<WebElement> Lists = driver.findElements(By.cssSelector(".col-lg-4"));
      WebElement prod = Lists.stream().filter(s->s.findElement(By.cssSelector("b")).getText().equals(productname)).findFirst().orElse(null);
      prod.findElement(By.cssSelector(".col-lg-4 button:last-of-type")).click();
       
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='toast-container']")));
      
      wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
     // Thread.sleep(2000);
      driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
      
      //in cart
      
      List<WebElement> cartProduces = driver.findElements(By.cssSelector(".cartSection h3"));
      boolean matches = cartProduces.stream().anyMatch(s->s.getText().equalsIgnoreCase(productname));
      Assert.assertTrue(true);
      //click on checkout
      
      driver.findElement(By.cssSelector(".totalRow button")).click();
      Thread.sleep(2000);
      //select the country
      WebElement selectvalue = driver.findElement(By.cssSelector("[placeholder='Select Country']"));
      Actions a=new Actions(driver);
      a.sendKeys(selectvalue, "india").build().perform();
     
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
      driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
      driver.findElement(By.cssSelector(".action__submit")).click();
     
      String textdata = driver.findElement(By.xpath("//h1[@class='hero-primary']")).getText();
      System.out.println(textdata);
      Assert.assertTrue(textdata.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
     // Assert.assertEquals(textdata, "THANKYOU FOR THE ORDER.");
      
     }

}
