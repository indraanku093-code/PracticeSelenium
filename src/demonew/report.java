package demonew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class report {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("the browser is opened now");
	  driver.manage().window().maximize();
	  Reporter.log("the browser is maximized");
	  driver.get("https://www.google.com");
	  Reporter.log("the google website is opened");
	  
  }
}
