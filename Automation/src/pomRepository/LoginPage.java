package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username") 
	public WebElement usernametextfeild;
	
	@FindBy(name="pwd") 
	public WebElement passwardtextfeild; 
	
	@FindBy(xpath= "//div[text()='Login ']") 
	public WebElement loginbutton; 
	
	//3. Busssiness Logics/generics
	public void loginaction(String username,String passward) {
		usernametextfeild.sendKeys(username);
		passwardtextfeild.sendKeys(passward);
		loginbutton.click();
		
	}
	

}
