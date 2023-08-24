package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavascriptPopUp1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/alerts");
		
		//clicking the button to get the alert popup
		driver.findElement(By.id("alertButton")).click();
		//switching the driver control to alert
		Alert popup = driver.switchTo().alert();
		Thread.sleep(2000);
		//clicking on the ok button
		popup.accept();
	
		Thread.sleep(2000);
		//clicking the button to get the ,confirmation popup
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		//clicking on the cancel butoon
		popup.dismiss();
		
		//scrooling down
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
		
		//clicking the button to get the ,prompt popup
		driver.findElement(By.id("promtButton")).click();
		
		//passing the value
		popup.sendKeys("ab bol na...");
		
		String message = popup.getText();
		System.out.println(message);
		
		//clicking on ok button
		popup.accept();

	}

}
