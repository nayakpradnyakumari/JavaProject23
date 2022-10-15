package testNG;

import org.testng.annotations.Test;

public class Before_After_Group {
	
	@Test(groups = {"Regression"})
	public void method1() {
     System.out.println("Method 1");
	}
	
	@Test(groups = {"Sanity"})
	public void method2() {
	     System.out.println("Method 2");
		}
	
	@Test(groups = {"Sanity","Regression"})          // both it will run
	public void method3() {
	     System.out.println("Method 3");
		}

}
