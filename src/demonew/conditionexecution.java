package demonew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class conditionexecution {
	public static WebDriver driver;
  @Test
  public void login() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver = new ChromeDriver();
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
		driver.findElement(By.className("hierarchyIconImg")).click();
		Thread.sleep(3000);
  }

  @Test(dependsOnMethods="login")
  public void MH() throws Throwable {
	  driver.findElement(By.className("hierarchyIconImg")).click();
		Thread.sleep(3000); 
		 driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_0")).click();
		  Thread.sleep(3000);
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnAddNew")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_txtLHName")).sendKeys(exceldata.dataread("sheet2", 1, 1));
			Thread.sleep(3000);
			driver.findElement(By.id("MainContent_M_ProductHierarchyControl_btnInsertProductHierarchy")).click();
	  
  }
  @Test(dependsOnMethods="login")
  public void MG() throws Throwable {
		driver.findElement(By.id("MainContent_M_DisplayPageNavigationControl_MoDataList_HyperLink1_7")).click();
		driver.findElement(By.id("MainContent_M_ManageGroupControl_btnAddNew")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("MainContent_M_ManageGroupControl_txtGroupName")).sendKeys(exceldata.dataread("sheet2", 1, 7));
		Thread.sleep(2000);
		driver.findElement(By.id("MainContent_M_ManageGroupControl_ddlSelectModule")).sendKeys(exceldata.dataread("sheet2", 2, 7));
		Thread.sleep(4000);
		driver.findElement(By.id("MainContent_M_ManageGroupControl_btnInsertGroup")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Admin Dashboard')]")).click();
  }
}
