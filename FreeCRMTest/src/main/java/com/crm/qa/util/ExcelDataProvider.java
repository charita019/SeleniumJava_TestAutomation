package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

	String filePath = "E:\\Charita\\Study\\GitSelenium\\Selenium\\SeleniumJava_TestAutomation\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testdata\\FreeCrmTestData.xlsx";
	String sheetName = "contacts";

	@DataProvider(name = "excelData")
	public Object[][] excelDataProvider() {
		Object[][] arrObj = null;
		try {
			arrObj = getExcelData(filePath, sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arrObj;
	}

	private String[][] getExcelData(String filePath, String sheetName) throws IOException {
		String[][] data = null;
		try {
			FileInputStream fis = new FileInputStream(filePath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetName);

			XSSFRow row = sheet.getRow(0); // heading or first row in excel
			int noOfRows = sheet.getPhysicalNumberOfRows(); // number of rows physically present in excel - eg 4 rows :
															// return 4 (including header)
			int noOfCols = row.getLastCellNum(); // index of last cell - return 3
			Cell cell; //
			data = new String[noOfRows - 1][noOfCols];

			for (int i = 1; i < noOfRows; i++) {
				for (int j = 0; j < noOfCols; j++) {
					row = sheet.getRow(i);
					cell = row.getCell(j);
					data[i - 1][j] = cell.getStringCellValue();
					System.out.println(i + " " + j + " " + cell.getStringCellValue());
				}
			}
			workbook.close();
		} catch (Exception e) {
			System.out.println("The exception is: " + e.getMessage());
		}
		return data;
	}
}
