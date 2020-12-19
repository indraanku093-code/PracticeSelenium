package Testcaseexecution;

import org.testng.annotations.Test;


import page.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class NewTest {
	  String driverPath = "./exefiles/chromedriver.exe";
	  WebDriver driver;
      login objLogin;
      
  @BeforeTest
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/home.aspx");
}
  @Test(priority=0)
public void test_Home_Page_Appear_Correct() throws InterruptedException{
objLogin = new login(driver);
//String loginPageTitle = objLogin.getloginTitle();
//Assert.assertTrue(loginPageTitle.toLowerCase().contains("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/home.aspx"));
objLogin.setusername("superuser1@modusliveqa.com");
Thread.sleep(3000);
objLogin.clicknext();
objLogin.setpassword("Cul45358");
Thread.sleep(5000);
objLogin.clicksignin();
objLogin.clickYes();

//objHomePage = new home();
//objHomePage.getUserName1();

//Assert.assertTrue(objHomePage.getUserName().toLowerCase().contains("operating model"));
  }
}
