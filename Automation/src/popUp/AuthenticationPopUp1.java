package popUp;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp1 {

	public static void main(String[] args) {
		
		String username = "admin";
		String passward = "admin";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://"+username+":"+passward+"@the-internet.herokuapp.com/basic_auth");

		//https://www.username:password@demoapp.com
	}

}
