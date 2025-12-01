package novembermonth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

	    // setting property of the chrome driver and passing the chromedriver path- but its not required for latest version of selenium
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishikesh\\Downloads\\chromedriver.exe");
		
		
		//invoking the browser instance
		
	    WebDriver driver = new ChromeDriver();
		
	    //Maximixing the browser window
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
		
	    //launching the url
	    Thread.sleep(2000);
	    driver.get("http://www.facebook.com");
	    
	    //Delete all cookies
	    Thread.sleep(2000);
	    driver.manage().deleteAllCookies();
	    
	    //Open url using navigate method
	    Thread.sleep(2000);
	    driver.navigate().to("https://www.google.com/");
	    
	    
	    //Refresh the page
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    
	    //Navigate back
	    Thread.sleep(2000);
	    driver.navigate().back();
	    
	    
	    //Navigate forward
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    
	    //fetc current url
	    Thread.sleep(2000);
	    driver.getCurrentUrl();
	    System.out.println(driver.getCurrentUrl());
	    
	    //Fetch title of the webpage
	    Thread.sleep(2000);
	    driver.getTitle();
	    System.out.println(driver.getTitle());
	    
	    //clsoe the browser instance
	    Thread.sleep(2000);
	    driver.close();
	    
	    
	    
	    
	    
	    
		
	    
	    
	    

	}

}
