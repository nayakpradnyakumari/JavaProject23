package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Before_After_Class {
	
	@Test
	public void method1() {
		System.out.println("Method1 of class 1");
	}
	
	
	@Test
	public void method2() {
		System.out.println("Method2 of class 1");
	}

}

class Before_After_Class2 {
	
	@Test
	public void method1() {
		System.out.println("Method1 of class 2");
	}
	
}

class Before_After_Class3 {
	
	@BeforeClass
	public void before() {
		System.out.println("Before class of class3");
	}
	
	@Test
	public void method1() {
		System.out.println("Method1 of class 3");
	}
	
	@Test
	public void method2() {
		System.out.println("Method2 of class 3");
	}
	
	@AfterClass
	public void after() {
		System.out.println("After class of class3");
	}
}
