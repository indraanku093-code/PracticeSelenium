package demonew;

import java.util.Scanner;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Antdemo {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");	
	}

	public static void main(String[] args) {
	System.out.println("hello world");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	//System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get(str);

	}

	

}
