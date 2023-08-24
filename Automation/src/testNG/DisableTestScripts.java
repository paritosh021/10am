package testNG;

import org.testng.annotations.Test;

public class DisableTestScripts {
//Q.if you have 5 test cases u want to run 1 and 5 what will u do?
	//-> I will use testing functionality enabled= false to disable 2 3 and 4.
	@Test
	public void qspiders() {
		System.out.println("testing");
	}	
	
	@Test(enabled= false)
	public void jspiders() {
		System.out.println("development");
	}
		
	@Test
	public void pyspiders() {
		System.out.println("python");
	}	


}
