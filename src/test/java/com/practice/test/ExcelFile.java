package com.practice.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) throws Throwable {
FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet("Details");
int count = sh.getLastRowNum();
for(int i=1;i<=count;i++) {
	  int lastcell = sh.getRow(i).getLastCellNum();
	 for(int j=0;j<lastcell;j++) {
		 String value = sh.getRow(i).getCell(j).getStringCellValue();
		 System.out.print(value+"-- ");
	 }
	 System.out.println();
}
	}

}
