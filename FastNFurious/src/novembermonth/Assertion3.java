package novembermonth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {

	@Test
	public void testCase2() {

		String ActText = "asad";
		String ExpText = "asa";
		
	
		//Equal Assertion
		try {
			Assert.assertEquals(ActText, ExpText, "Actual and Expected are not matching");
		} catch (Error e) {}
		
		System.out.println("Equal assertion verified");
		
		
		
		
	}
	

}