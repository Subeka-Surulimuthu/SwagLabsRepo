package helperfunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class helperFunction {
	
	WebDriver driver;
	
	public helperFunction(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void waitUNtillVIsibility(By locator) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		
	}
	
	public List<Object> readDataFromExcel() throws IOException {
		
		ArrayList<Object> data=new ArrayList<>();
		
		FileInputStream fis=new FileInputStream("C:/Users/subek/OneDrive/Desktop/Automation/Excel for Selenium/TestdataforSwagLAbs.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("products");
		Iterator<Row> rows=sheet.rowIterator();
		rows.next();
		while(rows.hasNext()) {
			
			Row row=rows.next();
			String dataa=row.getCell(0).getStringCellValue();
			
			data.add(dataa);
			
			
			
			
		}
		return data;
		
		
		
		
		
		
		
	}
	
	

}
