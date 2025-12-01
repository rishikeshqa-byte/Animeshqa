package novembermonth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/alerts");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		 
		 //handling th poppedup alert - if not clicked we will not be allowed to perofrm any action
		 //it will be done by JavaScript Executor
		 //(This from line 23 -27 is written by me and its working fine but its not proper method)
		 /*Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("document.findElementByName('OK').click()");// this is one way but definitely try with more methods/ways to  do this
		 Thread.sleep(2000);
		 System.out.println(driver.switchTo().alert().getText());*/
		 
		 //proper method by shammi 
		 //Accept alert using JavaScript Executor
		 Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("document.getElementById('confirmButton').click()");
		 Thread.sleep(2000);
		 System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().accept();
		 System.out.println("Alert accepted");
		 
		//Dismiss alert using JavaScript Executor
		 Thread.sleep(2000);
		 JavascriptExecutor tt = (JavascriptExecutor) driver;
		 tt .executeScript("document.getElementById('confirmButton').click()");
		 Thread.sleep(2000);
		 System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().dismiss();
		 System.out.println("Alert dismissed");
		 
		 //second way to handle alert
		 
		 
		 
		 
		 

	}

}
