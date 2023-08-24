package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelSheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// converting the physcial represtation to java represtattion
		FileInputStream fis= new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Automation\\testdata\\ExcelData1.xlsx");
		
		//Accessing the workbook
		Workbook workbook = WorkbookFactory.create(fis);
		
		//Accessing the sheet
		Sheet sheet = workbook.getSheet("Sheet1");
		
		//Accessing the row
		Row row = sheet.getRow(1);
		
		//Accessing the cell
		Cell cell = row.getCell(0);
		
		//Fetching the string value
		String customername = cell.getStringCellValue();
		
		System.out.println("the customer is :"+customername);
		
		long customerphoneno = (long)row.getCell(1).getNumericCellValue();
		
		System.out.println(customername+"'s phone no. is :"+customerphoneno);
		
		boolean customerstatus = row.getCell(2).getBooleanCellValue();
		
		if(customerstatus) {
			System.out.println("Go for marriage");
		}
		else
			System.out.println("Find someone");
		
		System.out.println("===================================================");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
