package novembermonth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	
	@Test
	public void testCase1(){
		String ExpText = "Facebook helps you connect and share with the people in your life.";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String ActualText = driver.findElement(By.xpath("//*[contains(text(),\"Facebook helps\")]")).getText();
		
		//Equals assertion
		Assert.assertEquals(ExpText, ActualText);
		System.out.println("Assert True is verified successfully");
		
		//False Assertion
		Assert.assertFalse(driver.findElement(By.xpath("//*[contains(text(),\"Facebook helps\")]")).isSelected());
		System.out.println("Assertion False is treated");
		
		//True Assertion
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),\"Facebook helps\")]")).isDisplayed());
		System.out.println("Assertion True is treated");
		
			}

}
