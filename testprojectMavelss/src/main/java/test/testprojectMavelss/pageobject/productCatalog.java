package test.testprojectMavelss.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testprojectMavelss.AbstactCompent.abstactComponts;

public class productCatalog extends abstactComponts 
{
	WebDriver driver;
      public productCatalog(WebDriver driver) 
      {
    	  super(driver);
    	  this.driver=driver;
    	  PageFactory.initElements(driver, this);
      }
      @FindBy(css=".col-lg-4")
      List<WebElement> productList;
      
      @FindBy(css=".ng-animating")
      WebElement spiner;
      
      
      By productlistss =By.cssSelector("b");
      By addToCart = By.cssSelector(".col-lg-4 button:last-of-type");
      By ToastMessges=By.cssSelector("#toast-Container");
      
      public List<WebElement> getProductList()
      {
    	  waitForProductToAppered(productlistss);
    	  return productList;
      }
      
      public WebElement getProductName(String productName)
      {
    	  WebElement values = getProductList().stream().filter(s->s.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
  		  return values;
      }
      
      public void addProductToCart(String productName)
      {
    	   WebElement values = getProductName(productName);
    	   values.findElement(addToCart).click();
		   waitForProductToAppered(ToastMessges);
		   WaitForProductDisappered(spiner);
      }
	
}
