package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo_Before_After_Method {
	
	@Test(priority=2)
	public void payment() {
		System.out.println("Payment while booking ticket");
	}
	
	
	@Test(priority=0)
	public void ticket() {
		System.out.println("Select Ticket for Booking");
	}
	
	
	@BeforeMethod
	public void login() {
		System.out.println("Login to IRCTC");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout from the system");
	}
	


}
