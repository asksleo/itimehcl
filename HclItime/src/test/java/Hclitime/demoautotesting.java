package Hclitime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoautotesting {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
	  WebDriver demo = new ChromeDriver();
	  demo.get("http://demo.automationtesting.in/AutoComplete.html");
	  Thread.sleep(4000);
	  demo.findElement(By.id("searchbox")).sendKeys("An");
	  Thread.sleep(4000);
	  List<WebElement> elec1=demo.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	  int len=elec1.size();
	  System.out.println(len);
	  for(WebElement list_values:elec1)
	  {if(list_values.getText().equalsIgnoreCase("afghanistan"))
	  {
		  list_values.click();
		  break;
	  }
		 
	  }
	//  demo.quit(); 
	  }
}
