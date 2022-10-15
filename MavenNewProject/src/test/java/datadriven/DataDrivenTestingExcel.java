package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTestingExcel {
	
	public FileInputStream fis;        // this is to read something from excel
	public FileOutputStream fos;        // this is to write or edit something from excel
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String path = ".\\Excel\\LoginData_Acti.xlsx";
	
	
	@Test
	public void Login(String userValue, String pwdValue) {
		
		WebDriverManager.chromedriver().setup();   
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys(userValue);
		
		driver.findElement(By.className("pwdfield")).sendKeys(pwdValue);
	
		driver.findElement(By.id("loginButton")).click();
		
	}
	
	
	@DataProvider(name="LoginData")
	public String[][] loginValues() throws FileNotFoundException, IOException {
		
		//Read data from excel and  store in an array
		
		DataDrivenTestingExcel ddt = new DataDrivenTestingExcel();
		int totalrows = ddt.getRowCount("Sheet1");
		int totalcols = ddt.getCellCount("Sheet1", 1);
		
		//String[][] loginData = { { "admin", "manager" } , { "trainee", "trainee" } , { "10", "20" } };
		String[][] loginData = new String[totalrows][totalcols];
		
		for(int i=1; i<totalrows; i++) {
					
			for(int j=0; j<totalcols; j++) {
						System.out.print(loginData[i][j]);	
			}
		}
		
		return loginData;
	}
	
	
	public int getRowCount(String sheetName) throws FileNotFoundException, IOException {
		
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		workbook.close();
		fis.close();
		return rowCount;
	}
	
	
	public int getCellCount(String sheetName, int rownum) throws FileNotFoundException, IOException {
		
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rownum);
		int cellCount = row.getLastCellNum();
		workbook.close();
		fis.close();
		return cellCount;
	}
	
	
	public String getCellData(String sheetName, int rownum, int cellnum) throws FileNotFoundException, IOException {
		
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rownum);
		cell = row.getCell(cellnum);
		String data;
		
		DataFormatter formatter = new DataFormatter();
		
		try {
			data = formatter.formatCellValue(cell);   //admin
		} catch(Exception ex) {
			data = "";
		}
		workbook.close();
		fis.close();
		return data;
		
	}
	

}