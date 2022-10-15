package testNG;

import org.testng.annotations.Test;

public class Test2 {

	                                                       // it will run alphabetically methods...priority not given then that test case will run first
	@Test(priority = 1)                                    // priority is given only to methods not to class
	public void ticketBooking() {
		System.out.println("Ticket booking for IRCTC");
		System.out.println("Step 1");
		
	}
	@Test(priority = 2)
	public void login() {
		System.out.println("login to IRCTC");
		
	}
	@Test(priority = 0)                                 // if priority not given the it will run alphabetically & starts from 0 priority
	public void Payment() {
		System.out.println("Payment while booking ticket");
	

	}

}
 class Test1 {
	 
	 @Test
	 public void Redbus() {
			System.out.println("login to Redbus");
	 
	
}

}