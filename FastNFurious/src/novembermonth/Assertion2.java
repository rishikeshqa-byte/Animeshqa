package novembermonth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {

	@Test
	public void testCase2() {

		String ActText = "asad";
		String ExpText = "asa";
		
		int a = 10;
		int b = 20;
		
		//Equal Assertion
		Assert.assertEquals(ActText, ExpText, "Actual and Expected are not matching");
		System.out.println("Equal assertion verified");
		
		//False Assertion
		Assert.assertFalse(a>b);
		System.out.println("False verified");
		
		//True Assertion
		Assert.assertTrue(a>b);
		//Assertion failed, test case execution will stop here.
		//Further line of code will not execute
		System.out.println("True Verified");
		
		
	}
	
	@Test
	public void testCase3() {
		//assertion is writtend testCase2()
		//Scope of assertion will be limited to the testCase2() methoda only
		System.out.println("Hello Mehotd - i am here");
	}
}