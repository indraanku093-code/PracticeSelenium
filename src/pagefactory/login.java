package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	WebDriver driver;
	@FindBy(name="loginfmt")
	 WebElement username;
	@FindBy(id="i0118")
	 WebElement password;
	@FindBy(id="idSIButton9")
	 WebElement next;
	@FindBy(id="idSIButton9")
	 WebElement signin;
	@FindBy(id="idSIButton9")
	 WebElement yes;
	public login(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public void setusername(String strUserName) {
		username.sendKeys(strUserName);
	}
	public void setpassword(String strPassword) {
		password.sendKeys(strPassword);
   }
	public void clicknext() {
		next.click();
	}
	public void clicksignin() {
		next.click();
	}
	public void clickyes() {
		next.click();
	}
	public void logintoQAsite(String strUserName,String strPassword) {
		this.setusername(strUserName);
		this.setpassword(strPassword);
		this.clicknext();
		this.clicksignin();
		this.clickyes();
		}

}
