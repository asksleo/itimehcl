package Hclitime;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class robotclassscreenshot {
  @Test
  public void f() throws InterruptedException, AWTException, IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
	  WebDriver hcl = new ChromeDriver();
	  hcl.get("https://myhcl.com/");
	  WebDriverWait var1= new WebDriverWait(hcl,10);
	  var1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='i0116']")));
	  hcl.findElement(By.xpath("//*[@id='i0116']")).sendKeys("karan.kumar@hcl.com");
	  hcl.findElement(By.id("idSIButton9")).click();
	  var1.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
	  hcl.findElement(By.id("i0118")).sendKeys("@Narak1234567");
	  var1.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
	  hcl.findElement(By.id("idSIButton9")).click();
	  WebDriverWait var2= new WebDriverWait(hcl,20);
	  var2.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
	  hcl.findElement(By.id("idSIButton9")).click();
	  hcl.findElement(By.id("txtSearch")).sendKeys("iti");
	  Thread.sleep(4000);
	 List<WebElement> ele1= hcl.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	 int len=ele1.size();
	 System.out.println(len);
	 Thread.sleep(4000);
	 for(WebElement list_values:ele1)
	 {
		 if(list_values.getText().equalsIgnoreCase("iTime (Time Sheet Management System)")) {
			 list_values.click();
			 break;
			 
		 }
	
	 }
Robot r1=new Robot();
Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
Rectangle rect1=new Rectangle(sc_size);
BufferedImage source= r1.createScreenCapture(rect1);
File Desitination =new File("C:\\Users\\karan\\Desktop\\java\\screen2.jpg");
ImageIO.write(source, "jpg", Desitination);


  }
}
