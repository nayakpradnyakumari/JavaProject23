package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazondropdown {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));  // in that search bar all option is there right click & inspect
        
        Select div = new Select(dropdown);                                // created object to call dropdown
	
     //   div.selectByVisibleText("Books");       // which option u want take that name directly
        
        //or
      //  div.selectByIndex(4);        // Amazon Fresh   ....count from zero..in that search bar it is 5th element from that all(which we need to select)but as we are counting from zero so its 4 position
        
        //or
       div.selectByValue("search-alias=furniture");    // electronics....click that html searchDropdownBox downarrow in that select which u want & take their value
        
	}

}
