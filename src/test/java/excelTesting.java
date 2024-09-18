import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelTesting {

	public static void main(String[] args) throws IOException {
	
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
	
	System.out.println(data);
	
	
	
	}
	
	
}
