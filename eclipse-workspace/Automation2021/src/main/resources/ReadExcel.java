import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) {
		File xl= new File("C:\\Users\\govar\\git\\SeleniumBasics\\src\\com\\qa\\testdata\\TestDataAutomation.xlsx");
		// load file
		FileInputStream fis = new FileInputStream(xl);
		// Load workbook
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			// Load shee
			XSSFSheet sheet= wb.getSheet("TestData");
			int rowcount= sheet.getLastRowNum();
			System.out.println("total number of rows in the sheet: "+rowcount);
	}

}
