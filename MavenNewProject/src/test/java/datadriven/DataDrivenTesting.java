package datadriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTesting {
	
	//https://testng.org/doc/documentation-main.html

	@Test(dataProvider="LoginData")
	public void Login(String userValue, String pwdValue) {
		
		WebDriverManager.chromedriver().setup();   
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys(userValue);
		
		driver.findElement(By.className("pwdfield")).sendKeys(pwdValue);
	
		driver.findElement(By.id("loginButton")).click();
		
		//logout
	}
	
	
	@DataProvider(name="LoginData", parallel = false)
	public String[][] loginValues() {
		
		String[][] loginData = { { "admin", "manager" } , { "trainee", "trainee" } , { "10", "20" } };
		
		return loginData;
		
	}
	
	
	/*
	
	public String test() {
		
		String name = "Virat";
		return name;
	}
	
	public String[][] test1() {
		
		String[][] name = { { "Virat", "Kohli" } };
		return name;
	}
	
	*/
	
	
	
	
	

}