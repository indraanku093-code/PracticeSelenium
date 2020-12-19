package demonew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allsiteurl {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//UAT site
		/*driver.get("https://modusuat.azurewebsites.net/Pages/Hierarchy/Home.aspx");
		Thread.sleep(3000);
		driver.findElement(By.id("i0116")).sendKeys(exceldata.dataread("Sheet3", 1, 1));
		Thread.sleep(6000);
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.name("passwd")).sendKeys(exceldata.dataread("sheet3", 1, 2));
		Thread.sleep(3000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(4000);*/
		//Landmark site
		driver.get("https://landmark-modus.azurewebsites.net/Pages/Hierarchy/Home.aspx?{StandardToken}");
		Thread.sleep(3000);
		driver.findElement(By.name("loginfmt")).sendKeys(exceldata.dataread("Sheet3", 2, 1));
		Thread.sleep(4000);
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.name("passwd")).sendKeys(exceldata.dataread("sheet3", 2, 2));
		Thread.sleep(3000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(4000);
		//client2 site
		driver.get( "https://modusclient2.azurewebsites.net/Pages/Hierarchy/Home.aspx?{StandardTokens}");
				Thread.sleep(3000);
				driver.findElement(By.name("loginfmt")).sendKeys(exceldata.dataread("Sheet3", 3, 1));
				Thread.sleep(4000);
				driver.findElement(By.id("idSIButton9")).click();
				driver.findElement(By.name("passwd")).sendKeys(exceldata.dataread("sheet3", 3, 2));
				Thread.sleep(3000);
				driver.findElement(By.id("idSIButton9")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("idSIButton9")).click();
				Thread.sleep(4000);
		//client1 site
	driver.get("https://modusclient1.azurewebsites.net/Pages/Hierarchy/Home.aspx");
				Thread.sleep(3000);
				driver.findElement(By.name("loginfmt")).sendKeys(exceldata.dataread("Sheet3", 4, 1));
				Thread.sleep(4000);
				driver.findElement(By.id("idSIButton9")).click();
				driver.findElement(By.name("passwd")).sendKeys(exceldata.dataread("sheet3", 4, 2));
				Thread.sleep(3000);
				driver.findElement(By.id("idSIButton9")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("idSIButton9")).click();
				Thread.sleep(4000);
	}

}
