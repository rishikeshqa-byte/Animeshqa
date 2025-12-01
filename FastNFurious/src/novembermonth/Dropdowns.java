package novembermonth;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.facebook.com");
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rishikeshdada");
		 driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		 Thread.sleep(2000);
		 
		 
		 //1st way to handle the dropdown element
		 List<WebElement> birthmonth = driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
		 System.out.println(birthmonth.size());
		 System.out.println("Total Months" + birthmonth.size());
		birthmonth.get(11).click();   //Dec
		Thread.sleep(2000);
		birthmonth.get(8).click();   //Sept
		
		
		
		//2nd Way
		WebElement bm = driver.findElement(By.xpath("//select[@id=\"month\"]")) ;
		Select bmd = new Select(bm);
		bmd.selectByValue("2");
		Thread.sleep(2000);
		bmd.selectByVisibleText("Apr");
		Thread.sleep(2000);
		bmd.selectByIndex(7);
		Thread.sleep(2000);
		
		
		//my way - vois way of langda automation- its not working at all
		/*driver.findElement(By.xpath("//select[@id=\"month\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Dec")).click();*/
		
		//3rd Way
				
		List<WebElement> drodwn = bmd.getOptions();
		System.out.println(drodwn.size());
		System.out.println("this is the size of drodwn" + drodwn.size());
	    for (int i = 0;  i < drodwn.size(); i++) {
	    	if(drodwn.get(i).getText().equalsIgnoreCase("Sep")) {
	    		System.out.println(drodwn.get(i).getText());
	    		drodwn.get(i).click();
	    		}
	    }
		
	 // 4th way need to find out the 4th way as this lecture is missing
		//Thread.sleep(2000);
		//WebElement rddd = driver.findElement(By.xpath("//select[@id=\\\"month\\\"]"));
		
		
		 
	}

}
