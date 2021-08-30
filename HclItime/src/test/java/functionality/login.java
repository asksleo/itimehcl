package functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import elements.locators;

public class login {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
	  WebDriver hcl = new ChromeDriver();
	  hcl.get("https://myhcl.com/");
	  WebDriverWait var1= new WebDriverWait(hcl,10);
	  var1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='i0116']")));
	  locators.emailid(hcl).sendKeys("karan.kumar@hcl.com");
	  locators.next(hcl).click();
	  var1.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
	 locators.password(hcl).sendKeys("@Narak1234567");
	  var1.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
	  locators.signin(hcl).click();
	  WebDriverWait var2= new WebDriverWait(hcl,20);
	  var2.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
	  hcl.findElement(By.id("idSIButton9")).click();
	  hcl.findElement(By.id("txtSearch")).sendKeys("itime");
  }
}
