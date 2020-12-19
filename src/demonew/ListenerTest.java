package demonew;

import org.testng.ITestListener;
import org.testng.annotations.Test;
import org.testng.ITestContext ;		
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {
	
	 
  @Override		
		    public void onTestFailure(ITestResult Result) 					
		    {		
		    System.out.println("The name of the testcase failed is :"+Result.getName());					
		    }
  
}
