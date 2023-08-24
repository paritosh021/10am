package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelector {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/HTML/demo.html");
		
		WebElement maleradiobutton = driver.findElement(By.cssSelector("input[kismat='barbad']"));
		
		maleradiobutton.click();		
		

	}

}
