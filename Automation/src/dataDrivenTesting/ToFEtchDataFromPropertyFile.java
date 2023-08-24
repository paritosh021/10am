package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFEtchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//1.converting the physical representation of property file to java representation
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Automation\\testdata\\propertyData.properties");
		
		//2.Reading the java representation of property file
		Properties prop = new Properties();
		prop.load(fis);
		
		//.3 Calling the value using the key
		String urlFromProperty = prop.getProperty("url");
		
		System.out.println("The Url is "+urlFromProperty);
		
		String usernameFromProperty = prop.getProperty("username");
		
		System.out.println("The username is "+usernameFromProperty);
		
		String passwardFromProperty = prop.getProperty("passward");
		
		System.out.println("The passward is "+passwardFromProperty);
		
		//System.out.println(prop.getProperty("url"));
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(urlFromProperty);
		
		driver.findElement(By.id("username")).sendKeys(usernameFromProperty);
		driver.findElement(By.name("pwd")).sendKeys(passwardFromProperty);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
}
