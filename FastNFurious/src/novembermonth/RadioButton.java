package novembermonth;

import java.nio.file.spi.FileSystemProvider;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			
		    //Maximixing the browser window
		    Thread.sleep(2000);
		    driver.manage().window().maximize();
			
		    //launching the url
		    Thread.sleep(2000);
		    driver.get("http://www.facebook.com");
		   driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rishikeshdada");
		   
		   driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		   
		   //1st way
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@value=1]")).click();
		   
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@value=2]")).click();
		   
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@value=-1]")).click();
		   
		   
		   //2nd way
		   
		  List<WebElement> radioElements = driver.findElements(By.xpath("//input[@type='radio']"));
		  System.out.println("Total radio buttons" + radioElements.size());
		  
		  System.out.println(radioElements.get(0).isSelected());
		  System.out.println(radioElements.get(1).isEnabled());
		  System.out.println(radioElements.get(2).isDisplayed());
		  
		  Thread.sleep(2000);
		  radioElements.get(1).click();
		   System.out.println(radioElements.get(2).isSelected());
		   
		   
		   
		   // 3rd way- this is the most preferable way in the industry
		   
		   List<WebElement> RadioClass = driver.findElements(By.xpath("//*[@class='_58mt']"));
		   System.out.println(RadioClass.size());
		   System.out.println("The size of Radio"+RadioClass.size());
		   String expResult = "female";
		   
		   for (int i=0;i<RadioClass.size(); i++) {
			   if(RadioClass.get(i).getText().equalsIgnoreCase(expResult)) {
				   RadioClass.get(i).click();
				   System.out.println(expResult + " Clicked");
			   }
		   }
		  
		   
		   
		
		
		

	}

}
