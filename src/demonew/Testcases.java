package demonew;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bsh.BshClassManager.Listener;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@Listeners(ListenerTest.class)

public class Testcases {
  public void login() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/home.aspx");
		Thread.sleep(3000);
		driver.findElement(By.name("loginfmt")).sendKeys(exceldata.dataread("Sheet1", 1, 0));
		Thread.sleep(4000);
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.name("passwd")).sendKeys(exceldata.dataread("sheet1", 1, 1));
		Thread.sleep(3000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(4000);
  }
  public void Testtofail() {
	  System.out.println("This message is used to check for the failed test case");
	  AssertJUnit.assertTrue(false);
  }
}
