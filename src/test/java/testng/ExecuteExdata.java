package testng;

import org.testng.annotations.Test;

public class ExecuteExdata {
	@Test(dataProviderClass = ReadDataFromExcel.class, dataProvider = "mobileexcel")
	public void execute(String name, String price, String size) {
		System.out.println(name+"--->"+price+"--->"+size);
	}
	

}
