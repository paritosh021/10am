package testNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test(priority=1)
	public void login() {
		System.out.println("login to the application");
	}
	
	@Test(priority=2,dependsOnMethods = "login")
	public void searchProduct() {
		System.out.println("product found");
	}

	@Test(priority=3,dependsOnMethods = "searchProduct")
	public void addToCart() {
		Assert.fail();
		System.out.println("product added to cart");
	}

	@Test(priority=4,dependsOnMethods = "addToCart")
	public void payment() {
		System.out.println("product paid");
	}
	
	@Test(priority=5,dependsOnMethods = "login")
	public void logout() {
		System.out.println("logged out from  the application");
	}



}
