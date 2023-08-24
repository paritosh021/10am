package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		String expectedErrorMsg = "Username or Password is invalid.";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(3000);
		
		String actualmsg = driver.findElement(By.className("errormsg")).getText();
		
		if(actualmsg.contains(expectedErrorMsg)) {
			System.out.println("pass: the error msg is verified");
		}
		else
			System.out.println("fail: the error msg is not verified");
		
	
	}

}
