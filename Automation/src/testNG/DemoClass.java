package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoClass{
	
	@Test
	
	public void verifyHomePage() {
		System.out.println("Hello World");
		Reporter.log("this is homea page", true);
	}

}
