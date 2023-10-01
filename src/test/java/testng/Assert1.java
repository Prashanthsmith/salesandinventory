package testng;

import  static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {
	@Test
	public void softAssert() {
		System.out.println("1");
		System.out.println("2");
		assertEquals("A", "A");
		System.out.println("3");
		System.out.println("4");
		
	}
	@Test(priority = 2)
	public void demo() {
		boolean b=false;
		System.out.println("5");
		System.out.println("6");

		
		assertFalse(b);
		System.out.println("7");
		System.out.println("8");


		
		
	}

}
