package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLoginUsingEnterButton {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedTitle = "actiTIME - Login";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement passward = driver.findElement(By.name("pwd"));
		
		username.sendKeys("admin");
		passward.sendKeys("pwd");
		passward.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("pass : the home page has been verified");
		}
		else
			System.out.println("fail : the home page has not been verified");
	}

}
