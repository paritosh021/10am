package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byid {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/demo.html");
		
		WebElement username = driver.findElement(By.id("321"));
		System.out.println(username);
		username.sendKeys("pathar maruga");
		
		WebElement passward = driver.findElement(By.name("paritosh"));
		
		passward.sendKeys("police pakdegi.. bhaagooo");

	}

}
