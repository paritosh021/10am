package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVeriFyToolTipText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement flipkartlogo = driver.findElement(By.xpath("//img[@src=\"//static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/flipkart-plus_8d85f4.png\"]"));
		
		String toolTipText = flipkartlogo.getAttribute("title");
		System.out.println(toolTipText);
	}

}
