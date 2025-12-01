package novembermonth;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.google.com");
		 
		 //Thread.sleep(20000); //THIS IS hard wait where the system will wait no matter what will happen
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// impliicit wait
		 driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How stuff works");
		 
		 //Handling autosuggestions
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// impliicit wait
		 
		 //List<WebElement> allsugestions = (List<WebElement>) driver.findElement(By.xpath("//ul[@role='listbox']/li"));
		 //List<WebElement>  xyz = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		 //System.out.println(xyz.size());
		 List<WebElement> allsugestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		 System.out.println(allsugestions.size());
		 
		 
		 // iterating over the set and find by text
		 for(int i = 0 ;i <allsugestions.size(); i++) {
			 String expR = "How stuff works science";
			 if(allsugestions.get(i).getText().equalsIgnoreCase(expR)) {
				 allsugestions.get(i).click();
				 break;
			 }
			 
		 }
		 
		 //System.out.println(allsugestions.size());
		 

	}

}
