package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Googletest {
	
	@Test
	public void googleTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
