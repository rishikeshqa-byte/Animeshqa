package novembermonth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousesimulation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 Thread.sleep(5000);
		 
		 //mouse simulaiton can be done by using Actions class
		 //inorder to do so the electronics element has the thing so find electornics first
		 
		 
		 WebElement lala = driver.findElement(By.xpath("//*[text()='Electronics']"));
		 
		 //create object for action class to simulate complex User interactions like keyboard press and mouse interactions
		 
		 Actions act = new Actions(driver);
		 
		 act.moveToElement(lala).build().perform();
		 
		 driver.findElement(By.xpath("//*[text()='Gaming']")).click();
		 
		 
		 //keyboard operation
		 Thread.sleep(2000);
		 WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
		act.sendKeys(men, Keys.ENTER).build().perform() ;
		
		
		//if i wanted to do right click on webpage
		 WebElement laa = driver.findElement(By.xpath("//*[text()='Electronics']"));
		Thread.sleep(2000);
		act.contextClick(laa).build().perform();
		
		 //part of above right click code i have declared the webelement again becuae i was getting the stale
		//element exeception which is common problem in selenium and hence to resolve it you will have to relocate
		//the element before this operation and it will work
		
		
		
		
		 
		 

	}

}
