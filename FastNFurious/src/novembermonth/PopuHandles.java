package novembermonth;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopuHandles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// clicking on button to get new tab in the browser
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();

		// Handling the Tab-step 1
		// get total number of open tabs with their unique alphanumeric id

		Set<String> allwindowIDs = driver.getWindowHandles();// we dont use List for this window handles
		String ParentwindowID = driver.getWindowHandle();
		System.out.println(allwindowIDs);
		System.out.println(ParentwindowID);

		/*
		 * for(String me : allwindowIDs) { driver.switchTo().window(me);
		 * if(!me.equals(ParentwindowID)){ System.out.println("chile tab url"+
		 * driver.getCurrentUrl()); } else { System.out.println("parent"+
		 * driver.getCurrentUrl()); } }
		 */

		for (String x : allwindowIDs) {
			driver.switchTo().window(x);
			if (x.equalsIgnoreCase(ParentwindowID)) {
				System.out.println("Parentwindow" + driver.getCurrentUrl());
			} else {
				System.out.println("childwindow" + driver.getCurrentUrl());
			}
		}

		// if we have 10 tabs how to switch between then go to 9th tab

		// Window handling- step 2
		driver.switchTo().window(ParentwindowID);
		Thread.sleep(5000);
		JavascriptExecutor jj = (JavascriptExecutor) driver;
		jj.executeScript("document.getElementById('windowButton').click()");

		Set<String> allwinids = driver.getWindowHandles();// we dont use List for this window handles
		System.out.println("This is the string for all windows" + allwinids);

		for (String x : allwinids) {
			driver.switchTo().window(x);
			System.out.println("Nononon" + x);
			System.out.println("this is the current window title" + driver.getTitle());
			System.out.println("this is current window url" + driver.getCurrentUrl());
		}
		
		//if i wanted to switch to specific window out of all open windows the i will convert the string of all window 
		//handles into array set, iterate over them and get whichever window i want to switch to and erform the testing.
            ArrayList<String> windowed = new ArrayList<>(allwinids);
            driver.switchTo().window(windowed.get(1));
            System.out.println(windowed.get(1));
            driver.get("https://www.google.com/");
	}

}
