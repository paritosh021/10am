package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	//How to execute same test script multiple times with multiple data?
	@Test(dataProvider = "data")
	public void trainer(String name,String subject) {
		System.out.println("Trainee Name :"+name+" subject :"+subject);
	}
	
	@DataProvider
	public Object[][] data(){
		
		Object[][] arr = new Object[4][2];
		
		arr[0][0] = "Shambhu sir";	
		arr[1][0] = "vinay sir";
		arr[2][0] = "priya mam";
		arr[3][0] = "Akash sir";
		
		arr[0][1] = "core java";	
		arr[1][1] = "manual";
		arr[2][1] = "advance java";
		arr[3][1] = "selenium";
		
		return arr;
		
	}
	
}
