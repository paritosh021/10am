package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagName {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement UserNameTextFeild = driver.findElement(By.id("username"));
		WebElement PasswardTextFeild = driver.findElement(By.name("pwd"));
		WebElement LoginButton  = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		String usernameTagname = UserNameTextFeild.getTagName();
		String PasswardTagname = PasswardTextFeild.getTagName();
		String loginButtonTagname = LoginButton.getTagName();
		
		if(usernameTagname.equals("input")&& PasswardTagname.equals("input")&& loginButtonTagname.equals("div")) {
			UserNameTextFeild.sendKeys("admin");
			PasswardTextFeild.sendKeys("manager");
			LoginButton.click();
		}
		else
			System.out.println("one of the tag names are not proper");
	}

}
