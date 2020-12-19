package demonew;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class setup_and_teardown {
  @Test
  public void f() {
	  System.out.println("hii1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("hii2");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("hii3");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("hii4");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("hii5");
  }
  

}
