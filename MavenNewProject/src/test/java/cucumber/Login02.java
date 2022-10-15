package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login02 {

public static WebDriver driver;
	
	@Given("open browser and navigate to url actitime02")
	public void browser() {
		
		WebDriverManager.chromedriver().setup();   
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
	}
	
	@When("enter valid (.*) and (.*) actitime02$")
	public void credentials(String username, String password) {
		
		driver.findElement(By.xpath("//a[@id='loginButton']//preceding::input[3]")).sendKeys(username);
		
		driver.findElement(By.xpath("//a[@id='loginButton']//preceding::input[2]")).sendKeys(password);
		
	}
	
	@And("click on login button actitime02")
	public void validateLogin() {
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
	}
	
	@Then("click on logout actitime02")
	public void validateLogout() throws InterruptedException {
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("logoutLink")).click();
	}

}

