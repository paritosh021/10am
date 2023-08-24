package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteDataIntoExcel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Automation\\testdata\\ExcelData1.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		//acessing the sheet
		Sheet sheet = workbook.getSheet("Sheet1");
		
		//creating the row and creating the cell and setting the value
		sheet.createRow(4).createCell(0).setCellValue("paritosh");
		
		//converting java represntation to Physical represntation of Excel
		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Automation\\\\testdata\\\\ExcelData1.xlsx");
		
		//writting the data in physical representation
		workbook.write(fos);
		
		//close workbook
		workbook.close();
		
		
		
	}
	
	

}
