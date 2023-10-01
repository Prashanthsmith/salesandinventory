package testng;

import org.testng.annotations.Test;

public class PracticeTest {

	@Test(priority=1)
	public void createCustomerTest() {
		System.out.println("Customer is created");
	}
	
	@Test( dependsOnMethods ="createCustomerTest" )
	public void editCustomer() {
		System.out.println("Customer data is updated");
	}
	@Test(invocationCount = 2,dependsOnMethods = "editCustomer")
	public void deleteCustomer() {
		System.out.println("Customer is deleted");
	}
}
