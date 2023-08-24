package testNG;

import org.testng.annotations.Test;

public class InvocationCount {
	
	//How to exexcute same test script multiple times with same data?
	@Test(invocationCount = 5 )
	public void demo() {
		System.out.println(" Hello paritosh!!");
		
	}

}
