package Hclitime;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class screenshot {
  @Test
  public void f() throws IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
	  WebDriver demo = new ChromeDriver();
	  demo.get("https://the-internet.herokuapp.com/javascript_alerts");
	 List<WebElement> ele1= demo.findElements(By.xpath("//*[@id='content']/div/ul/li"));
	 int len =ele1.size();
	 System.out.println(len);
	demo.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
	demo.switchTo().alert().accept();
	Thread.sleep(2000);
	 
	    TakesScreenshot t1=(TakesScreenshot) demo; 
		 File Source=t1.getScreenshotAs(OutputType.FILE);
		 File Desitination =new File("C:\\Users\\karan\\Desktop\\java\\screen3.jpg");
		 FileHandler.copy(Source, Desitination);
		 Thread.sleep(4000);
		 
		 demo.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();
		 Thread.sleep(3000);
		 demo.switchTo().alert().dismiss();
		 TakesScreenshot t2=(TakesScreenshot) demo; 
		 File Source1=t2.getScreenshotAs(OutputType.FILE);
		 File Desitination1 =new File("C:\\Users\\karan\\Desktop\\java\\screen4.jpg");
		 FileHandler.copy(Source1, Desitination1);
		 
		 Thread.sleep(4000);
		 demo.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button")).click();
		 Thread.sleep(3000);
		 demo.switchTo().alert().sendKeys("Text");
		 Thread.sleep(3000);
		 demo.switchTo().alert().accept();
		 TakesScreenshot t3=(TakesScreenshot) demo; 
		 File Source2=t3.getScreenshotAs(OutputType.FILE);
		 File Desitination2 =new File("C:\\Users\\karan\\Desktop\\java\\screen5.jpg");
		 FileHandler.copy(Source2, Desitination2);
  }
}
