package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Bridgei2i\\eclipse-workspace\\June9.30AmBatch\\Excel Data\\Empdetials.xlsx");
	
		FileInputStream stream = new FileInputStream(file);
		
		Workbook book = new XSSFWorkbook(stream);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
		
		String s = cell.getStringCellValue();
		System.out.println(s);
				
			}
			
		}
	}

}
