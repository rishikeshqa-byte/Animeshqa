package novembermonth;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jLogger {

	public static void main(String[] args) {

		// Create logger instance
		Logger logger = Logger.getLogger("Log4jLogger");

		// configure log4j.properties file
		PropertyConfigurator.configure("F:\\Final Destination\\FastNFurious\\Repository\\log4j.properties");

		// open browser instance
		WebDriver driver = new ChromeDriver();
		logger.info("browser is opened");
		
		driver.manage().window().maximize();
		logger.info("the browser window is maximized");
		
		//driver.close();
		//logger.info("the window is closed");

	}

}
