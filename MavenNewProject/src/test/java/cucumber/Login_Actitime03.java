package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Login_Actitime03_Page;

public class Login_Actitime03 {
	
	public WebDriver driver;
	
	public Login_Actitime03_Page lp;
	
	@Given("open browser and navigate to url {string}")
	public void openbrowser(String url) {
		
		WebDriverManager.chromedriver().setup();   
		
		driver = new ChromeDriver();
		
		lp = new Login_Actitime03_Page(driver);
		
		driver.get(url);
		
		driver.manage().window().maximize();
	}
	
	@When("enter valid username as {string} and password as {string}")
	public void credentials(String username, String password) {
		
		lp.setUsername(username);  //admin
		lp.setPassword(password);
		
	}
	
	@Then("click on login button actitime03")
	public void validateLogin() {
		
		lp.clickLogin();
	}
}

