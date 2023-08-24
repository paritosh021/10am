package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignmentIssues {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/HTML/demo.html");
		
		WebElement username = driver.findElement(By.id("321"));
		WebElement passward = driver.findElement(By.name("paritosh"));
		
		Point usernamelocation = username.getLocation();
		int usernamestartX = usernamelocation.getX();
		
		int usernamewidth = username.getSize().getWidth();
		int usernameEndx = usernamestartX+usernamewidth;
		
		Point passwardlocation = username.getLocation();
		int passwardstartX = usernamelocation.getX();
		
		int passwardwidth = username.getSize().getWidth();
		int passwardEndx = usernamestartX+usernamewidth;
		
		
		
		
	}
}


