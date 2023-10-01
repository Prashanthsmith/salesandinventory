package testng;

import org.testng.annotations.Test;

public class DataProviderExn {

	@Test(dataProviderClass =DataProviderTest.class, dataProvider = "mobile")
	public void getData(String name, int price, int size) {
		System.out.println(name+"--->"+price+"--->"+size+"inch");
	}
	
}
