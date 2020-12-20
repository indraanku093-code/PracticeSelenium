package demonew;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class screenshot 
{

public static void screenimage(WebDriver driver, String screenname) throws Throwable
	{
	
	    //data
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./testdata/"+screenname+".png");
		FileUtils.copyFile(srcfile, destfile);
		
	}


}
