package com.practice.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingMultipleData {

	public static void main(String[] args) throws Throwable {
		Scanner S=new Scanner(System.in);
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Test1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int row=5;
		short lastcell =2;

		for(int i=0;i<=row;i++) {
			sh.createRow(i);
			for(int j=0;j<lastcell;j++) {
				if(j==0) {

				System.out.println("Enter name");
				sh.getRow(i).createCell(j).setCellValue(S.nextLine());
			}
				else {
					System.out.println("Enter Location");
					sh.getRow(i).createCell(j).setCellValue(S.nextLine());
				}
					
				}


		}
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Test1.xlsx");
		wb.write(fos);
		System.err.println("Data is sucessfully entered in excel");
			wb.close();

	}
}



