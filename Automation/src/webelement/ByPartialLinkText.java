package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPartialLinkText {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/HTML/demo.html");
		
		WebElement linktext = driver.findElement(By.partialLinkText("Goto"));
		
		linktext.click();

	}

}
