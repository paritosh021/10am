package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOGetAllIds {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//navigate the url
		driver.get("https://demo.actitime.com/login.do");
		//click on link
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		//fetch all the window ids
		Set<String> allIds = driver.getWindowHandles();
		
		System.out.println(allIds);
		
		for(String id:allIds) {
			System.out.println(id);
		}
	}

}
