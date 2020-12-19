package demonew;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QAOmdashboard {
	
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
		driver.findElement(By.id("MainContent_M_HomeControl_dtlist1_hypModule1_1")).click();
		String windowHandle = driver.getWindowHandle();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		ArrayList tabs = new ArrayList(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window((String) tabs.get(0));
		driver.findElement(By.xpath("(//li[@class='ActiveSubmoduleGroupColor'])[16]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Automation')]")).click();
		Thread.sleep(3000);
		/*// ADD FOR HEADER LEVEL
		driver.findElement(By.id("btnAddNew")).click();
		  driver.findElement(By.id("txtHeaderTitle")).sendKeys("abc");
		  driver.findElement(By.id("chkHeader")).click(); Thread.sleep(4000);
		  driver.findElement(By.className("ms-Button-label")).click();
		  Thread.sleep(3000); 
		  driver.switchTo().alert().accept(); 
		  Thread.sleep(5000);
		  driver.navigate().refresh(); 
		  //ADD FOR LEVEL ZERO
		 driver.findElement(By.xpath("//img[@id='btnAddNewLevelZero' and @src='../Content/Images/OM_Images/add-icon.png']")).click();
		  Thread.sleep(3000);
		 driver.findElement(By.id("txtTitle")).sendKeys("def");
		 driver.findElement(By.id("chk")).click();
		 driver.findElement(By.id("selectProcessHeaderLevelZero")).sendKeys("abc");
		  Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@onclick='InsertUpdateLevelZero();']")).click(); 
		 Thread.sleep(3000); 
		 driver.switchTo().alert().accept(); 
		 //ADD FOR LEVEL ONE 
		 driver.findElement(By.id("btnAddNewLevelOne")).click();
		 //driver.findElement(By.xpath("//img[@id='btnAddNewLevelOne' and @leveloneid='7170']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("txtTitleLevelOne")).sendKeys("ghi");
		  driver.findElement(By.id("txtShortDescriptionLevelOne")).sendKeys("h");
		 driver.findElement(By.xpath("(//span[contains(text(),'None selected')])[1]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@type='checkbox' and @value='65']")).click();
		  driver.findElement(By.className("multiselect-selected-text")).click();
		 driver.findElement(By.xpath("//button[@type='button' and @title='Select Department']")).click();
		 driver.findElement(By.xpath("//input[@type='checkbox' and @value='94']")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'Test lead')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'Select Role')]")).click();
		 driver.findElement(By.xpath("//input[@type='checkbox' and @value='417']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[contains(text(),'Automation tester ')]")).click();
		  driver.findElement(By.id("chkLevelOne")).click();
		  Thread.sleep(4000); 
		 driver.findElement(By.id("btnSaveLevelOne")).click();
		 Thread.sleep(3000);
		 driver.switchTo().alert().accept(); 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[contains(text(),' ghi')]")).click();
		 Thread.sleep(2000);*/
		 //ADD FOR LEVEL TWO
		 driver.get("https://modusliveqa.azurewebsites.net/Home/OMLevel2?Level1ID=7178&SectionID=1");
		 driver.findElement(By.xpath("//span[contains(text(),'Add Level Two')]")).click();
		 driver.findElement(By.id("txtTitle-level2")).sendKeys("jkl");
		 driver.findElement(By.id("txtShortDescriptionLevelTwo")).sendKeys("h");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//span[contains(text(),'None selected')])[1]")).click();
		  driver.findElement(By.xpath("//input[@type='checkbox' and @value='65']")).click();
		 driver.findElement(By.className("multiselect-selected-text")).click();
		 driver.findElement(By.xpath("//button[@type='button' and @title='Select Department']")).click();
		 driver.findElement(By.xpath("//input[@type='checkbox' and @value='94']")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'Test lead')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'Select Role')]")).click();
		 driver.findElement(By.xpath("//input[@type='checkbox' and @value='417']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[contains(text(),'Automation tester ')]")).click();
		 driver.findElement(By.id("txtchk-level2")).click();
		 Thread.sleep(3000); 
		 driver.findElement(By.xpath("(//textarea[@id='txtChangeNote-level2']/../../following-sibling::div//div)[2]")).click();
		  Thread.sleep(4000); 
		String path = "C:\\Users\\Shikha Kumari\\Downloads\\picture\\abc.jpeg"; 
		 StringSelection str= new StringSelection(path);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_C); robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyRelease(KeyEvent.VK_C); robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyRelease(KeyEvent.VK_V); robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER); Thread.sleep(2000);
		  driver.findElement(By.id("btnSave-level2")).click(); Thread.sleep(4000);
		  driver.switchTo().alert().accept(); Thread.sleep(5000);
		  //ADD FOR LEVEL THREE
		  driver.findElement(By.id("Button-AddNew-Level3")).click();
		  driver.findElement(By.id("txtTitle")).sendKeys("mno");
		  driver.findElement(By.id("txtShortDescriptionLevelThree")).sendKeys("n");
		  driver.findElement(By.xpath("(//span[contains(text(),'None selected')])[1]")).click();
		   driver.findElement(By.xpath("//input[@type='checkbox' and @value='65']")).click();
		 driver.findElement(By.className("multiselect-selected-text")).click();
		   driver.findElement(By.xpath("//button[@type='button' and @title='Select Department']")).click();
		  driver.findElement(By.xpath("//input[@type='checkbox' and @value='94']")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'Test lead')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'Select Role')]")).click();
		 driver.findElement(By.xpath("//input[@type='checkbox' and @value='417']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[contains(text(),'Automation tester ')]")).click();
		 driver.findElement(By.id("txtchk")).click(); Thread.sleep(3000);
		  driver.findElement(By.id("txtChangeNote-Level3")).sendKeys("anku");
		   driver.findElement(By.xpath( "(//textarea[@id='txtChangeNote-Level3']/../../following-sibling::div//div)[2]")).click();
		Thread.sleep(4000); 
		 String path1 ="C:\\Users\\Shikha Kumari\\Downloads\\picture\\abc.jpeg"; 
		  StringSelection str1 = new StringSelection(path1);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1, null);
		  Robot robot1 = new Robot(); robot1.keyPress(KeyEvent.VK_CONTROL);
		 robot1.keyPress(KeyEvent.VK_C); robot1.keyRelease(KeyEvent.VK_CONTROL);
		  robot1.keyRelease(KeyEvent.VK_C); robot1.keyPress(KeyEvent.VK_CONTROL);
		  robot1.keyPress(KeyEvent.VK_V); robot1.keyRelease(KeyEvent.VK_CONTROL);
		  robot1.keyRelease(KeyEvent.VK_V); robot1.keyPress(KeyEvent.VK_ENTER);
		  robot1.keyRelease(KeyEvent.VK_ENTER); Thread.sleep(2000);
		  driver.findElement(By.id("btnSave")).click(); Thread.sleep(4000);
		  driver.switchTo().alert().accept(); Thread.sleep(5000);
		  driver.findElement(By.id("ItemPreviewLevelThree")).click();
		  //ADD FOR LEVEL FOUR
		  driver.findElement(By.id("Button-AddNew-Level4")).click();
		  driver.findElement(By.id("txtTitleLevelFour")).sendKeys("pqr");
		  driver.findElement(By.xpath("(//span[contains(text(),'None selected')])[1]")).click();
		  driver.findElement(By.xpath("//input[@type='checkbox' and @value='65']")).click();
		  driver.findElement(By.className("multiselect-selected-text")).click();
		  driver.findElement(By.xpath("//button[@type='button' and @title='Select Department']")).click();
		 driver.findElement(By.xpath("//input[@type='checkbox' and @value='94']")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'Test lead')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'Select Role')]")).click();
		  driver.findElement(By.xpath("//input[@type='checkbox' and @value='417']")).click();
		  Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[contains(text(),'Automation tester ')]")).click();
		 driver.findElement(By.id("txtchkLevelFour")).click();
		  driver.findElement(By.id("txtTimeLevelFour")).sendKeys("10:45");
		  driver.findElement(By.xpath("(//textarea[@id='txtChangeNoteLevelFour']/../../following-sibling::div//div)[2]")).click();
		 Thread.sleep(4000);
	     String path2 = "C:\\Users\\Shikha Kumari\\Downloads\\image\\30.jpg"; 
	     StringSelection str2 = new StringSelection(path1);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1, null);
		  Robot robot2 = new Robot(); robot2.keyPress(KeyEvent.VK_CONTROL);
		  robot2.keyPress(KeyEvent.VK_C); robot2.keyRelease(KeyEvent.VK_CONTROL);
		  robot2.keyRelease(KeyEvent.VK_C); robot2.keyPress(KeyEvent.VK_CONTROL);
		  robot2.keyPress(KeyEvent.VK_V); robot2.keyRelease(KeyEvent.VK_CONTROL);
		  robot2.keyRelease(KeyEvent.VK_V); robot2.keyPress(KeyEvent.VK_ENTER);
		  robot2.keyRelease(KeyEvent.VK_ENTER); Thread.sleep(2000);
		  driver.findElement(By.id("btnSave")).click(); Thread.sleep(4000);
		  driver.switchTo().alert().accept(); Thread.sleep(5000);
		 

	}

}
