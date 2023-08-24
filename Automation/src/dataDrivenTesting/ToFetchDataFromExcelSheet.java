package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Automation\\testdata\\ExcelData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.getRow(4);
		
		Cell cell = row.getCell(0);
		
		String employname = cell.getStringCellValue();
		
		System.out.println(employname);
		
		long employphoneno = (long)row.getCell(1).getNumericCellValue();
		System.out.println(employphoneno);
		
		boolean employestattus = row.getCell(3).getBooleanCellValue();
		if(employestattus) {
			System.out.println("20 hike");
	
		}
		else
			System.out.println("go home");
		
		String employ2name = sheet.getRow(2).getCell(0).getStringCellValue();
		long employ2phoneno = (long)sheet.getRow(2).getCell(1).getNumericCellValue();
		int employ2projecthandling = (int)sheet.getRow(2).getCell(2).getNumericCellValue();
		boolean employ2status = sheet.getRow(2).getCell(3).getBooleanCellValue();
		
		
		
		
	}

}
