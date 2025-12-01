package novembermonth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // setting property of the chrome driver and passing the chromedriver path- but its not required for latest version of selenium
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishikesh\\Downloads\\chromedriver.exe");
		
		
		//invoking the browser instance
		
	    WebDriver driver = new ChromeDriver();
		
	    //Maximixing the browser window
	    driver.manage().window().maximize();
		
	    //launching the url
	    driver.get("http://www.facebook.com");
		
	}

}
