package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSubmitAFormWithoutMandatoryInfo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).submit();
		Thread.sleep(3000);
		WebElement errormsg = driver.findElement(By.xpath("(//i[@class='_5dbc img sp_wMkcN9uIsOh sx_9529be'])[2]"));
		
		if(errormsg.isDisplayed()) {
			System.out.println("The form is not submitted");
		}
		else
			System.out.println("The form is submitted");
	}

}
