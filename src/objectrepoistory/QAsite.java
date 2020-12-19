package objectrepoistory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class QAsite {
  @Test
  public void login() throws IOException, InterruptedException {
	  File src=new File("application.properties");
		FileInputStream fis=new FileInputStream(src);
		 Properties pro=new Properties();
		 pro.load(fis);
		 
		 System.out.println("Property class loaded");
		   System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/home.aspx");
		 driver.findElement(By.xpath(pro.getProperty("QA.login.username.xpath"))). sendKeys("superuser1@modusliveqa.com");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath(pro.getProperty("QA.login.next.xpath"))).click();
		 Thread.sleep(3000);
		  driver.findElement(By.xpath(pro.getProperty("QA.login.password.xpath"))). sendKeys("Cul45358");
		  Thread.sleep(8000);
		  driver.findElement(By.xpath(pro.getProperty("QA.login.Sign.in.xpath"))).click();
		Thread.sleep(4000);
		 driver.findElement(By.xpath(pro.getProperty("QA.login.Yes.xpath"))).click();
		 
		  
  }
}
