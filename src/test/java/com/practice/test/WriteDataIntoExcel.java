package com.practice.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Details");
		sh.createRow(7).createCell(0).setCellValue("virat");
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Data.xlsx");
		wb.write(fos);
		wb.close();

	}

}
