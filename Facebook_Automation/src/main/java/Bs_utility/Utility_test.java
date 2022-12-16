package Bs_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Base.BaseClass; //14/22

public class Utility_test extends BaseClass {
	public static String TestDataPath = "G:\\Workspace directory\\Facebook_Automation\\src\\main\\java\\BS_Testdata\\FreeTestData.xlsx";

	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;

	public static Object[][] getTestData(String sheetName) {
		FileInputStream file_excel = null;
		try {
			file_excel = new FileInputStream(TestDataPath); //file read
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file_excel); // for multiple file prps
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();

		}
		sheet = book.getSheet(sheetName); // to handle multiple sheet
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()]; //read sheet's row & column
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}
		return data;
	}
}