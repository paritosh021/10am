package webDriver;


import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPOsition {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
	
		
		int Xcoordinate=pos.getX();
		int ycoordinate=pos.getY();
		
		
		System.out.println("the x coordinate is :"+Xcoordinate);
		System.out.println("the y coordinate is :"+ycoordinate);
		
		

	}

}
