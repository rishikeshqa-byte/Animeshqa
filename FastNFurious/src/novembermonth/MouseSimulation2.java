package novembermonth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/draggable/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		 
		 //Switching to frame
		 driver.switchTo().frame(0);
		 
		 //Draggable web element
		 
		 WebElement drag = driver.findElement(By.id("draggable"));
		 
		 
		 //Drag and Drop Actions class
		 Thread.sleep(5000);
		 Actions act= new Actions(driver);
		 act.dragAndDropBy(drag, 200, 100).build().perform();
		 
		 
		 
	}

}
