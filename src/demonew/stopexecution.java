package demonew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class stopexecution {
	@Test
	public void login() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("the browser is opened now");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://modusliveqa.azurewebsites.net/Pages/Hierarchy/home.aspx");

		Thread.sleep(3000);
		Reporter.log("the QA site is opened now");
		driver.findElement(By.name("loginfmt")).sendKeys(exceldata.dataread("Sheet1", 1, 0));
		Thread.sleep(4000);
		Reporter.log("the QA site email page is opened now");
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.name("passwd")).sendKeys(exceldata.dataread("sheet1", 1, 1));
		Thread.sleep(3000);

		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("idSIButton9")).click();

	}
}
