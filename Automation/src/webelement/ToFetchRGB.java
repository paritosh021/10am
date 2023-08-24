package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchRGB {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String rgb = driver.findElement(By.name("login")).getCssValue("background-color");
		System.out.println(rgb);
	}

}
