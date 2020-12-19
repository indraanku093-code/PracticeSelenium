package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
WebDriver driver;
By username=By.name("loginfmt");
By next=By.id("idSIButton9");
By password=By.id("i0118");
By signin=By.id("idSIButton9");
By Yes=By.id("idSIButton9");


public login(WebDriver driver) {
this.driver=driver;
}
public void setusername(String strUserName) {
	driver.findElement(username).sendKeys(strUserName);
}
public void setpassword(String strPassword) {
	driver.findElement(password).sendKeys(strPassword);
}
public void clicknext() {
	driver.findElement(next).click();
}
public void clicksignin() {
	driver.findElement(next).click();
	}
	public void clickYes() {
		driver.findElement(next).click();
		}
public void logintoQAsite(String strUserName,String strPassword) {
	this.setusername(strUserName);
	this.setpassword(strPassword);
	this.clicknext();
	this.clicksignin();
	this.clickYes();
}

public String getloginTitle() {
	// TODO Auto-generated method stub
	return null;
}
public void login(String string, String string2) {
	// TODO Auto-generated method stub
	
}
}
	


