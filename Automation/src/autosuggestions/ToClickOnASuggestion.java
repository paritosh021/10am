package autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnASuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("movies");
		
		Thread.sleep(2000);
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//span[text()='movies']"));
		
		System.out.println("The no. of autosuggetions are :"+autoSuggestions.size());
		
		for(WebElement suggestion:autoSuggestions) {
			if(suggestion.getText().contains("watch")) {
				suggestion.click();
				break;
				
			}
		}
			

	}

}
