package org.sample;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class MavenBrowseLaunch {
	
	public static void main(String[] args) throws IOException {
		
		
	File file = new File("C:\\Users\\Bridgei2i\\eclipse-workspace\\June9.30AmBatch\\Excel Data\\Empdetials.xlsx");
	FileInputStream stream = new FileInputStream(file);
	
	Workbook book = new XSSFWorkbook(stream);
	
	Sheet sheet = book.getSheet("Sheet1");
	
	Row row = sheet.getRow(2);
	Cell cell = row.getCell(4);
	
	String string = cell.getStringCellValue();
	System.out.println(string);
	
	
	
	}

}
