package novembermonth;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readingpropertiesfile {

	public static void main(String[] args) throws IOException, Exception {

		// Specify the location of config file
		File src1 = new File("F:\\Final Destination\\FastNFurious\\Repository\\Configu.properties");
		// create file input stream class to load the file
		FileInputStream fis1 = new FileInputStream(src1);
		// Create properties class object to read properties file
		Properties pro1 = new Properties();
		pro1.load(fis1);

		// Specify the location of locators file
		File src2 = new File("F:\\Final Destination\\FastNFurious\\Repository\\Locators.properties");
		// create file input stream class to load the file
		FileInputStream fis2 = new FileInputStream(src2);
		// Create properties class object to read properties file
		Properties pro2 = new Properties();
		pro2.load(fis2);

		// Specify the location of test data file
		File src3 = new File("F:\\Final Destination\\FastNFurious\\Repository\\TestData.properties");
		// create file input stream class to load the file
		FileInputStream fis3 = new FileInputStream(src3);
		// Create properties class object to read properties file
		Properties pro3 = new Properties();
		pro3.load(fis3);
		
		
		
		//getProperty() method will accept the key and return thevalue of that key
		WebDriver driver = new ChromeDriver();
		driver.get(pro3.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(pro2.getProperty("NewTabButton"))).click();
		driver.findElement(By.xpath(pro2.getProperty("Search"))).sendKeys(pro3.getProperty("Anna"));
	}

}
