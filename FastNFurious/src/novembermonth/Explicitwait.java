package novembermonth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.facebook.com");
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //Enterusername
		 driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rishikeshdada");
		 
		 //fetch the entered value
		 driver.findElement(By.xpath("//*[@id='email']")).getAttribute("value");
		 
		 //User explicit wait
		 WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(30));
		 
		 wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("dada");
		 
	}

}
