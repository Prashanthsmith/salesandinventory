
package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.salesandinventory.generic.Excelutility;

public class ExcelTestNgGeneric {
	
	@Test(dataProvider = "execlGeneric")
	public void execute(String name,String price,String size) {
		System.out.println(name+"-->"+price+"-->"+size);
	}
	
	
	
	
	
	
	
   @DataProvider
   public Object[][] execlGeneric() throws Throwable
   {
	   Excelutility elib=new Excelutility();
	   Object[][] value = elib.readMultiSetData("TestngExcel");
	   return value;
   }
	
}
