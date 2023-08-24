package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyWhetherTheDimensionsAreSameOrNot {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/HTML/demo.html");
		
		WebElement username = driver.findElement(By.id("321"));
		WebElement passward = driver.findElement(By.name("paritosh"));
		
		Dimension usernamedim = username.getSize();
		int usernameheight = usernamedim.getHeight();
		int usernamewidth = usernamedim.getWidth();
		
		Dimension passwarddim = username.getSize();
		int passwardheight = passwarddim.getHeight();
		int passwardwidth = passwarddim.getWidth();
		
		if(usernameheight==passwardheight && usernamewidth==passwardwidth) {
			System.out.println("pass : the dimensions are verified");
		}
		else
			System.out.println("fail : the dimensions are not verified");
		
		driver.quit();

	}

}
