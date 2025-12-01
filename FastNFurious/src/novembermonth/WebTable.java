package novembermonth;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://money.rediff.com/gainers");
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		//WebElement table= driver.findElement(By.xpath("//table[@class='dataTable']"));
		//List<WebElement> rows = table.findElements(By.tagName("tr"));
		//List<WebElement> columns = table.findElements(By.xpath("//table[@class='dataTable']/thead/tr"));
		//System.out.println(rows.size());
		//System.out.println(columns.size());
		
		 
		//below code written to find the total records in the table
		 
		List<WebElement> listof = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		listof.size(); //size of the table cells i can say
		System.out.println(listof.size());
		
		//below code i was writing to find out the values in the companies column list
		List<WebElement> companies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println(companies.size());
		
		//writing below code to get the links/no of links available in first companies column using anchor tag a
		List<WebElement> companieslink = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println(companieslink.size());
		
		
		//create list of all companies current price
		List<WebElement> companiyprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println(companiyprice.size());
		
		String ExResult = "GE Power India";
		
		
		for(int i =0 ; i< companies.size(); i++) {
			if(companies.get(i).getText().equalsIgnoreCase(ExResult)) {
				System.out.println("Price for" + ExResult +"is : "+companiyprice.get(i).getText());
				System.out.println(companies.get(i).getText());
				companieslink.get(i).click();
				System.out.println(driver.getTitle());
				break;
			}
		}
		
		// have to practice some more programs to get the price and compare it if its matching then we can selet the product
		
		
		
		driver.close();

	}

}
