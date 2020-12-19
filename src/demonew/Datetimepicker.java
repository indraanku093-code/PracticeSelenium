package demonew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datetimepicker {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
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
		
		driver.get("https://modusliveqa.azurewebsites.net/Home/OMLevel3?ParentId=7404&Level2ID=7395&SectionID=1");
		driver.findElement(By.className("subeditprocess4")).click();
		driver.findElement(By.id("txtWhenLevelFour")).clear();
		driver.findElement(By.id("txtWhenLevelFour")).sendKeys("17-11-2019");
		//driver.findElement(By.cssSelector("far-fa-calendar")).click();
		
		WebElement textbox = driver.findElement(By.className("ms-DatePicker-prevMonth js-prevMonth"));
		textbox.click();
		//textbox.sendKeys(Keys.ARROW_LEFT);
		//driver.findElement(By.className("ms-DatePicker-nextMonth js-nextMonth")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'17')]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.id("txtTimeLevelFour")).clear();
	
		//driver.findElement(By.id("txtTimeLevelFour")).sendKeys("02:45");
	}

}
