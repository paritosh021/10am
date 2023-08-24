package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// converting Excel Represntation of data into java Represntation
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Automation\\testdata\\ExcelData.xlsx");
		
		//Reading or Accessing the workbook
		Workbook workbook = WorkbookFactory.create(fis);
		
		//Reading or Accessing the sheet
		Sheet sheet = workbook.getSheet("sheet1");
		
		//Reading or Accessing the row
		Row row = sheet.createRow(5);
		
		//puting cell value
		row.createCell(0).setCellValue("Rupesh Khan");
		row.createCell(1).setCellValue("90912719371");
		
		//converting java represntation into Excel represntation
		FileOutputStream fos= new FileOutputStream("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Automation\\\\testdata\\\\ExcelData.xlsx");
		
		//write
		workbook.write(fos);
		workbook.close();
		
	}

}
