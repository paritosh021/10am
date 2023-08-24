package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToChildBrowser {

	public static void main(String[] args) {
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//navigate the url
				driver.get("https://demo.actitime.com/login.do");
				
				Set<String> parentWindowID = driver.getWindowHandles();
				
				//click on link
				driver.findElement(By.linkText("actiTIME Inc.")).click();
				
				Set<String> allDS = driver.getWindowHandles();
				
				for(String id:allIDs) {
					driver.switchTo().window(id);
				
					if(!id.equals(parentWindowID)) {
						Thread.sleep(5000);
						driver.close();
						
					}
				}

	}

}
