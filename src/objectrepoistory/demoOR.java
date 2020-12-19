package objectrepoistory;


import java.io.File;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoOR {
  @Test
  public void testgmail() throws IOException, InterruptedException {
	  File src=new File("application.properties");
	FileInputStream fis=new FileInputStream(src);
	 Properties pro=new Properties();
	 pro.load(fis);
	 
	 System.out.println("Property class loaded");
	   System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	  driver.findElement(By.xpath(pro.getProperty("gmail.login.username.xpath"))). sendKeys("krishikha096@gmail.com");
	 
	 driver.findElement(By.xpath(pro.getProperty("gmail.login.next.xpath"))).click();
	 Thread.sleep(4000);
	  driver.findElement(By.xpath(pro.getProperty("gmail.login.password.xpath"))). sendKeys("9370014084");
	 driver.findElement(By.xpath(pro.getProperty("gmail.login.next.xpath"))).click();
	  
  }
}

