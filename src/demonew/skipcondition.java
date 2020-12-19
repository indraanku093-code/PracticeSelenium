package demonew;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.SkipException;

public class skipcondition {
	
	@Test
	public void testCaseConditionalSkipException() throws Throwable{
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
//		driver.findElement(By.className("hierarchyIconImg")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_0")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnAddNew")).click();
//		Thread.sleep(2000);
//
//		System.out.println("Im in Conditional Skip");
//		String s="abc";
//		if(s.equals(exceldata.dataread("sheet2", 1, 1)))
//
//			throw new SkipException("Skipping this exception");
		System.out.println("Executed Successfully");
  }
  
 
}
