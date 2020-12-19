package demonew;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

@Test
public class Dataprovider {
	WebDriver driver;
    String driverPath = "./exefiles/chromedriver.exe";
    
    @BeforeTest
    public void setup(){
        
         System.setProperty("webdriver.chrome.driver", driverPath);
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("https://www.google.com");
         driver.manage().window().maximize();
    }
    @Test(dataProvider="SearchProvider")
    public void testMethod(String author,String searchKey) throws InterruptedException{
    {
        WebElement searchText = driver.findElement(By.name("q"));
        searchText.sendKeys(searchKey);
        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
        Thread.sleep(3000);
        String testValue = searchText.getAttribute("value");
        //System.out.println(testValue +"::::"+searchKey);
        searchText.clear();
       Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
       
    }
    }
    @DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "ram", "India" },
            { "Krishna", "UK" },
            { "Bhupesh", "USA" },
            
        
    };
  }
}
