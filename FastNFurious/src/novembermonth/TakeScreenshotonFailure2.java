package novembermonth;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotonFailure2 {
	
	TakeScreenshotONFailure1 t1 = new TakeScreenshotONFailure1();
	
	
	@Test
	
	public void Logindo() {
		t1.driver = new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		t1.driver.get("https://www.facebook.com/");
		t1.driver.findElement(By.id("emild")).sendKeys("sfafa");
		
	}
	

	
	@AfterMethod
	public void TakeScreenshot (ITestResult result2) throws Exception {
		t1.captureScreenshot(result2);
	}
}
