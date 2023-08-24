package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class GoogleTestDemo {
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void googledemo(String browser) {
		
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		
		if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.google.com/");
		
	}

}
