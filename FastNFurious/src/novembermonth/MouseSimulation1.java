package novembermonth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		 
		 //Switching to frame
		 driver.switchTo().frame(0);
		 
		 //Draggable web element
		 
		 WebElement drag = driver.findElement(By.id("draggable"));
		 
		 //Droppable Web Element
		 
		 WebElement drop = driver.findElement(By.id("droppable"));
		 
		 
		 //Drag and Drop Actions class
		 Thread.sleep(2000);
		 Actions act= new Actions(driver);
		 act.dragAndDrop(drag, drop).build().perform();
		 
		 
		 
	}

}
