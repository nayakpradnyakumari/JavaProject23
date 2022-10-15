package cucumber;

import org.openqa.selenium.By;                           // in
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;          // in cucumber dont run java file run only feature file bcoz in cucumber u have to create two files

public class Login {                                      // keep same name as feature file name like login in src test resources
	                                                      // # is used tocoomment out in cucumber
	public static WebDriver driver ;
	
	@Given("open browser and navigate to url actitime")
	public void browser () {
		
        WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
			
	}
	
	@When("enter valid username and password actitime")
    public void credentials () {
		
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@id='username']//following::input[1]")).sendKeys("manager");
			
	}
    
	@And("click on login button actitime")
    public void validateLogin () {
		
		driver.findElement(By.xpath("//input[@id='username']//following::a[1]")).click();
		
	}
    
	@Then("click on logout actitime")
    public void validateLogout () {
		
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		
	}

}
