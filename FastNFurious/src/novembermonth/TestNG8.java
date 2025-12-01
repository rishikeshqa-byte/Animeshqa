package novembermonth;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG8 {

	WebDriver driver;

	@BeforeClass
	public void setEnv() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@DataProvider
	public Object[][] dataSet() throws Exception {

		File src3 = new File("F:\\Final Destination\\FastNFurious\\Repository\\TestData.properties");
		FileInputStream fis3 = new FileInputStream(src3);
		Properties pro3 = new Properties();
		pro3.load(fis3);
		Object arr[][] = new Object[3][2];

		arr[0][0] = pro3.getProperty("TestData1");
		arr[0][1] = pro3.getProperty("TestData2");

		arr[1][0] = pro3.getProperty("TestData2");
		arr[1][1] = pro3.getProperty("TestData2");

		arr[2][0] = pro3.getProperty("TestData3");
		arr[2][1] = pro3.getProperty("TestData3");

		return arr;
	}

	@Test(dataProvider = "dataSet")
	public void enterData(String userName, String password) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Anna");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Anna");

	}
}
