package testNG;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=1)
	public void qspiders() {
		System.out.println("testing");
	}	
	
	@Test(priority=2)
	public void jspiders() {
		System.out.println("development");
	}
		
	@Test(priority=3)
	public void pyspiders() {
		System.out.println("python");
	}	
	

}
