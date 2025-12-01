package novembermonth;

import java.awt.Window;
import java.time.Duration;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.facebook.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //Delete all your cookies
		 Thread.sleep(2000);
		 
		 //Javascript Executor 
		 
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 
         // if i wish to locate any element using javascript then
		 
		 jse.executeScript("document.getElementById('email').value='abs'");
		 jse.executeScript("document.getElementsByName('pass')[0].value='lalala'");
		 jse.executeScript("document.getElementsByName('login')[0].click()");
		 
		 //Scroll down using javascript
		 Thread.sleep(5000);
		 jse.executeScript("window.scrollBy(0,500)");
		 
		//Scroll up using javascript
		 Thread.sleep(2000);
		 jse.executeScript("window.scrollBy(0,-500)");
		 
		 //understand the logic about this (0,-500)
		 
		 //if i wish to left to right and right to left- assignment to do at home
		 
		 
		
	}

}
