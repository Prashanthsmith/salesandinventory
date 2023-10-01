package com.salesandinventory.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * This class contains excel related methods.
 * @author prashanth
 *
 */
public class Excelutility  extends JavaUtility{
/**
 * This method helps to read the data from excel sheet.
 * @param sheetname
 * @param rownumber
 * @param cellnumber
 * @return
 * @throws EncryptedDocumentException
 * @throws FileNotFoundException
 * @throws IOException
 */
	public String readDataFromExcelSheet(String sheetname,int rownumber,int cellnumber) throws Throwable {
		Workbook wb = WorkbookFactory.create(new FileInputStream(IpathConstants.ExcelFilePath));
		Sheet sh = wb.getSheet(sheetname);
		Row row= sh.getRow(rownumber);
		Cell c = row.getCell(cellnumber);
		return c.getStringCellValue();
		}
	
	/**
	 * This method helps to write data into excel sheet.
	 * @param sheetname
	 * @param rownumber
	 * @param cellnumber
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void writeDataIntoExcelSheel(String sheetname,int rownumber,int cellnumber,String value) throws Throwable {
		Workbook wb = WorkbookFactory.create(new FileInputStream(IpathConstants.ExcelFilePath));
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.createRow(rownumber);
		Cell cell = row.createCell(cellnumber);
		cell.setCellValue(value);
		FileOutputStream fout=new FileOutputStream(IpathConstants.ExcelFilePath);
		wb.write(fout);
		wb.close();
	}
	/**
	 * This method helps to fetch last row number.
	 * @param sheetname
	 * @return
	 * @throws IOException
	 */
	public int getLastRowNumber(String sheetname) throws IOException {
		Workbook wb = WorkbookFactory.create(IpathConstants.ExcelFilePath);
		Sheet sh = wb.getSheet(sheetname);
		int lastRow=sh.getLastRowNum();
		return lastRow;
	}
	public HashMap<String, String> readMultipleData(String sheetName, int keycolumn, int valuecolumn, WebDriver driver) throws Throwable{
		FileInputStream fis=new FileInputStream(IpathConstants.ExcelFilePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int count = sh.getLastRowNum();
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i=1;i<=count;i++) {
			String key = sh.getRow(i).getCell(keycolumn).getStringCellValue();
			String value = sh.getRow(i).getCell(valuecolumn).getStringCellValue();
			map.put(key, value);
		}
		for(Entry<String, String> s:map.entrySet()) {
			if(s.getKey().contains("Phone Number")) {
				driver.findElement(By.xpath(s.getKey())).sendKeys(s.getValue()+getrandomNumber());
				}
			else {
				driver.findElement(By.xpath(s.getKey())).sendKeys(s.getValue());
			}
		}
		 
	return map;
	}
	public Object[][] readMultiSetData(String SheetName) throws Throwable {
		FileInputStream fis=new FileInputStream(IpathConstants.testngexcelfilepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		int lastRow=sh.getLastRowNum()+1;
		int lastCell=sh.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lastRow][lastCell];
		for(int i=0;i<lastRow;i++) {
			for(int j=0;j<lastCell;j++) {
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
		
	}
	
	
	
}
