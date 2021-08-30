package Hclitime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ulselectable {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
	  WebDriver demo = new ChromeDriver();
	  demo.get("http://demo.automationtesting.in/Selectable.html");
	  demo.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(4000);
	 List<WebElement> ele1= demo.findElements(By.xpath("//*[@id=\"Serialize\"]/ul/li"));
	 int len =ele1.size();
	 System.out.println(len);
	 Actions act1=new Actions(demo);
	 act1.keyDown(Keys.CONTROL).click(ele1.get(1)).click(ele1.get(2)).click(ele1.get(4)).build().perform(); 
	 
	 // demo.quit();
  }
}

//*[@id="Serialize"]/ul