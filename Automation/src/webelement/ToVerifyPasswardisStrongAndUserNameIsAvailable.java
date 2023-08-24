package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyPasswardisStrongAndUserNameIsAvailable {

	public static void main(String[] args) throws InterruptedException {
		String expectedUsernamemsg = "kuchbhilikhosir";
		String passward = "Qspiders@321";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("imparitosh21@gmail.com");
		Thread.sleep(2000);
		//click on continue button
		driver.findElement(By.xpath("//button[@data-continue-to='password-container']")).click();
		//pass value to passward
		driver.findElement(By.id("password")).sendKeys(passward);
		Thread.sleep(3000);
		//checking passward is strong or not
		 String msgfForStrongPassward = driver.findElement(By.xpath("//p[contains(@class,'password-validity-summary password-validity-summary')]")).getText();
		
		if(msgfForStrongPassward.contains( "strong")) {
			System.out.println("pass the passward is strong");
			Thread.sleep(2000);
			//click on continue button
			driver.findElement(By.xpath("//button[@data-continue-to='username-container']")).click();
			Thread.sleep(3000);
			//pass value to username
			driver.findElement(By.id("login")).sendKeys(expectedUsernamemsg);
			Thread.sleep(3000);
			//checking user name is available or not
			String ActualUserNameMsg = driver.findElement(By.id("login-err")).getText();
			
			if(ActualUserNameMsg.equals(expectedUsernamemsg+" is available.")) {
				System.out.println("pass : username is available");
			}
			else
				System.out.println("fail :username is not available");
			
		}
		else
			System.out.println("fail : passward is not strong");
		
	}

}
