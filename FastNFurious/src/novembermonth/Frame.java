package novembermonth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://paytm.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		 
		 Thread.sleep(2000);
		 driver.switchTo().frame(0);

         // find the total number of frames present on web page.
		 int allframes = driver.findElements(By.tagName("iframe")).size();
		 System.out.println("total no of frames =="+ allframes);
		 
		 //check if the element present or not
		 //below block of code if there are more number of frames- need to practice programs where i can see multiple frames
		 
		 for (int i=0; i<allframes; i++) {
			 driver.switchTo().frame(i);
			// driver.switchTo().frame(i);
			 
			 String expText = "Tap Scan option available at the bottom";
			 String actText = driver.findElement(By.xpath("//*[text()='Tap Scan option available at the bottom']")).getText();
			 
			 if(actText.equalsIgnoreCase(expText)) {
				 System.out.println("found");
				 break;
			 }
			 else {
				 System.out.println("notfound");
			 }
			 
		 }
		 
	}

}
