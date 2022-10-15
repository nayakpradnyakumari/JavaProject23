package testNG;

	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Demo_Before_After_Test {

		@Test(priority=2)
		public void payment() {
			System.out.println("Payment while booking ticket");
		}
		
		
		@Test(priority=0)
		public void ticket() {
			System.out.println("Select Ticket for Booking");
		}
		
		
		@BeforeTest
		public void login() {
			System.out.println("Login to IRCTC");
		}
		
		
		@AfterTest
		public void logout() {
			System.out.println("Logout from the system");
		}
		

}
