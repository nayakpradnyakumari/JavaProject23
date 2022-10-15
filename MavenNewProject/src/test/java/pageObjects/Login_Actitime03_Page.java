package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Actitime03_Page {
	
	public WebDriver driver;
	
	//Constructor
	public Login_Actitime03_Page(WebDriver ldriver) {
		//System.out.println("hey this is constructor of page");
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//a[@id='loginButton']//preceding::input[3]")
	WebElement username;
	
	@FindBy(xpath="//a[@id='loginButton']//preceding::input[2]")
	WebElement password;
	
	@FindBy(id="loginButton")
	WebElement login;
	
	public void setUsername(String uname) {
		//uname stores value "admin" which is came from credentials method of Login_Actitime03
		username.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		login.click();
	}

}