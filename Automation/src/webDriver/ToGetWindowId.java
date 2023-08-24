package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowId {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		
		String windowId = driver.getWindowHandle();
		
		System.out.println("the window 1 id is : "+windowId);

		ChromeDriver driver1 = new ChromeDriver();
		
		String windowId2 = driver1.getWindowHandle();
		
		System.out.println("the window 2 id is : "+windowId2);

	}

}
