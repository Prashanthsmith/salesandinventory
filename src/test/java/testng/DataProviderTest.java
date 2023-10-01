package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	

	
	@DataProvider
	public Object[][] tv()
	{
		Object[][] obj=new Object[2][3];
		
		obj[0][0]="onida";
		obj[0][1]=15000;
		obj[0][2]=24;
		
		obj[1][0]="SamSung";
		obj[1][1]=12000;
		obj[1][2]=21;
		
		return obj;
	}
	@DataProvider
	public Object[][]mobile(){
		Object[][]obj=new Object[2][3];
		obj[0][0]="Realme";
		obj[0][1]=16000;
		obj[0][2]=10;
		
		obj[1][0]="Redmi";
		obj[1][1]=10000;
		obj[1][2]=12;
		return obj;
	}
	
}
