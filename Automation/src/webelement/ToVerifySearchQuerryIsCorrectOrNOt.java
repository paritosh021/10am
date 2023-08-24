package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifySearchQuerryIsCorrectOrNOt {

	public static void main(String[] args) {
		String expectedQuerry = "BMW India";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement textfield = driver.findElement(By.name("q"));
		
		
		textfield.sendKeys("BMW India");
		textfield.sendKeys(Keys.ENTER);
		
		String sourcecode = driver.getPageSource();
		
		if(sourcecode.contains(expectedQuerry)) {
			System.out.println("pass : the search querry is verified");
		}
		else
			System.out.println("fail : the search querry is not verified");
		
	}

}
