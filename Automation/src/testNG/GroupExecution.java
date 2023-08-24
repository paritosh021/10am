package testNG;

import org.testng.annotations.Test;

public class GroupExecution {
	
	@Test(groups = "smoke")
	public void signup() {
		System.out.println("the user has signed up");
	}
	
	@Test(groups = "smoke")
	public void login() {
		System.out.println("the user has logged in");
	}
	
	@Test(groups = "smoke")
	public void compose() {
		System.out.println("the user has composed");
	}
	
	@Test(groups = "regression")
	public void delete() {
		System.out.println("the user has deleted");
	}
	
	@Test(groups = "regression")
	public void logout() {
		System.out.println("the user has logged out");
	}
	
	@Test(groups = "regression")
	public void signout() {
		System.out.println("the user has signed out");
	}

}
