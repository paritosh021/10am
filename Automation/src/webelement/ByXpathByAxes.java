package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpathByAxes {

	public static void main(String[] args) {
		
		//Dynamic Xpath
		String ProductName = "APPLE iPhone 11 (White, 128 GB)";
		String ProductPrice = "₹45,499";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_1_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_1_na_na_na&as-pos=1&as-type=RECENT&suggestionId=iphone%7CMobiles&requestId=1528d964-919d-4117-9fd3-78221c3a76f2&as-backfill=on");
		
		WebElement priceofiphone = driver.findElement(By.xpath("//div[text()='"+ProductName+"']/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[text()='"+ProductPrice+"']"));
	
		String actualprice = priceofiphone.getText();
		
		System.out.println(actualprice);
		
	}
}
