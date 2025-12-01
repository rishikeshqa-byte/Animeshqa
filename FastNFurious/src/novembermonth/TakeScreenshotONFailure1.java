package novembermonth;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotONFailure1 {
	WebDriver driver;
	
	//ITestResult will provide us the test case execution status and test name
	
	public void captureScreenshot(ITestResult result) throws IOException {
		
		if(ITestResult.FAILURE ==result.getStatus()) {
			//create ref of TakeScreenshot Interface and Type Casting
			
			TakesScreenshot ts = (TakesScreenshot) driver; //Type casting of two interfaces
			
			
			
			
			//use getScreenshotAs() to ca[ture the screenshot in the file format
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			
			//Copy the file to specific location
			File destFolder = new File("./screenhshots/" + result.getName() + ".png");
			FileUtils.copyFile(sourceFile, destFolder);
			System.out.println(result.getName() + "method() failed, screenshot captured.");
			
			
		}
		
	}

}
