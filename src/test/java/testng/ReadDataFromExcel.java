package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import com.salesandinventory.generic.IpathConstants;

public class ReadDataFromExcel {

	@DataProvider
	public Object[][] mobileexcel() throws Throwable {
		FileInputStream fis=new FileInputStream(IpathConstants.testngexcelfilepath);
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet("TestngExcel");
		 int lastRow=sh.getLastRowNum()+1;
		 int lastCell=sh.getRow(0).getLastCellNum();
		 Object[][]obj=new Object[lastRow][lastCell];
		 
		 
		 for(int i=0;i<lastRow;i++) {
			 
			 for(int j=0;j<lastCell;j++) {
				 obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			 }
		 }
		 return obj;
	}
}
