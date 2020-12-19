package demonew;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class launch {
	public WebDriver driver;
  @Test
  public void verify() {
	  String expectedTitle = "Welcome: to google";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
  }
  @BeforeTest
  public void launch() {

		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
  }

  @AfterTest
  public void terminate() {
	  driver.close();
  }

}
