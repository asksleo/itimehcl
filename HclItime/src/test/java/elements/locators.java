package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class locators {
  @Test
  public static WebElement emailid(WebDriver hcl) {
	  return hcl.findElement(By.xpath("//*[@id='i0116']"));
	  
  }
  public static WebElement next(WebDriver hcl)
  {
  return hcl.findElement(By.id("idSIButton9"));
  }
  public static WebElement password(WebDriver hcl)
 {
	 return hcl.findElement(By.id("i0118"));
 }
public static WebElement signin(WebDriver hcl)
{
	return hcl.findElement(By.id("idSIButton9"));
}

} 