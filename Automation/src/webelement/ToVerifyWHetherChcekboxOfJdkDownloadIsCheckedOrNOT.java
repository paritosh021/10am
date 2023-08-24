package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class ToVerifyWHetherChcekboxOfJdkDownloadIsCheckedOrNOT {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement textfield = driver.findElement(By.name("q"));
		textfield.sendKeys("download jdk 1.8");
		textfield.sendKeys(Keys.ENTER);
		
		
	}

}
