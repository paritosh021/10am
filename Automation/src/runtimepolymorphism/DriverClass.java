package runtimepolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverClass {

	public static void main(String[] args) {
		
		TOverifyGoogleTitle.test(new ChromeDriver());
		System.out.println("the appln has been tested in Chrome");

		TOverifyGoogleTitle.test(new EdgeDriver());
		System.out.println("the appln has been tested in Edge");
	}

}
