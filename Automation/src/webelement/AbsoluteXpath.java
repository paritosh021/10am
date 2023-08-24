package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/DELL/Desktop/HTML/demoXpath.html");
		WebElement thirdtextfield = driver.findElement(By.xpath("html/body/div[2]/input[1]"));
		
		thirdtextfield.sendKeys("kuch bhi bolo yaar");
		
		
	}

}
