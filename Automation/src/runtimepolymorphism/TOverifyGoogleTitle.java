package runtimepolymorphism;

import org.openqa.selenium.WebDriver;

public class TOverifyGoogleTitle {
	
	public static void test(WebDriver driver) {
		
		driver.get("https://www.google.com/");
		String actualtitle = driver.getTitle();
		
		if(actualtitle.contains("Google")) {
			
		System.out.println("pass: the title is verified");
		}
		else
			System.out.println("fail: the title is not verified");
		driver.quit();
	}
}
