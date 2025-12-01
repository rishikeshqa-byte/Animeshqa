package novembermonth;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {

	public static void main(String[] args) throws IOException, Exception {
		// Specify the location of the excel file
		// String filepath = "F:\\Final Destination\\TestDataFile.xlsx";

		File src = new File("F:\\Final Destination\\TestDataFile.xlsx");

		// Load the file
		FileInputStream fis = new FileInputStream(src);

		// Load the workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// load the worksheet
		XSSFSheet sheet = wb.getSheet("Sheet1");

		// Print the Name of sheet
		System.out.println(sheet.getSheetName());

		// print the value of cell 0 from row 0
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());

		// print the value of merged sheet
		System.out.println(sheet.getRow(4).getCell(0).getStringCellValue());

		// Print Triveni from given sheet
		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());

		// Print mango from given sheet
		System.out.println(sheet.getRow(3).getCell(0).getStringCellValue());

		// print int from the the sheet
		System.out.println((int) sheet.getRow(5).getCell(0).getNumericCellValue());

		// print float/double from the the sheet
		System.out.println(sheet.getRow(6).getCell(0).getNumericCellValue());

		// print total number of rows 1st way
		System.out.println("total number of rows are " + sheet.getPhysicalNumberOfRows());

		// print total number of rows 2nd way
		System.out.println("total number of rows are " + (sheet.getLastRowNum() + 1));

		// print total number of columns 1st way
		System.out.println("total number of rows are " + sheet.getRow(0).getPhysicalNumberOfCells());

		// print total number of rows 2nd way
		System.out.println("total number of rows are " + (sheet.getRow(0).getLastCellNum()));

		// Real time implementation
		WebDriver driver = new ChromeDriver();

		// Maximixing the browser window
		Thread.sleep(2000);
		driver.manage().window().maximize();

		// launching the url
		Thread.sleep(2000);
		driver.get("http://www.facebook.com");
		
		String username = sheet.getRow(10).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);

		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
	}

}
