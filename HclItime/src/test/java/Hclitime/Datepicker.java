package Hclitime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Datepicker {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
	  

		WebDriver d1=new ChromeDriver();
		
		d1.manage().window().maximize();

		d1.get("http://demo.automationtesting.in/Datepicker.html");

	
      JavascriptExecutor jse=(JavascriptExecutor) d1;
      
      jse.executeScript("document.getElementById('datepicker2').value='29/08/2021'");
      
}


  }

