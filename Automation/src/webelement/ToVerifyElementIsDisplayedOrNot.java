package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyElementIsDisplayedOrNot {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("galat emailid ");
		Thread.sleep(2000);
		
		WebElement errormsg = driver.findElement(By.xpath("//p[text()='Email is invalid or already taken']"));
		
		boolean displayed = errormsg.isDisplayed();
		
		if(displayed) {
			System.out.println("pass : the error is verified");
		}
		else
			System.out.println("fail : the error is not verified");
		

	}

}
