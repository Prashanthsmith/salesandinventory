package testng;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsExecution {
@Test(invocationCount = 2)
public void demo() {
	System.out.println("--Test Scripts execution starts 1--");
}
@BeforeSuite
public void configBS() {
	System.out.println("--connect to database");
}
@org.testng.annotations.BeforeClass
public void configBC()  {
	System.out.println("--Open the browser"); 
}
@BeforeMethod
public void configBM() {
	System.out.println("--Login to the application");
}
@AfterMethod
public void configAM() {
	System.out.println("--Logout from the application");
}
@org.testng.annotations.AfterClass
public void configAC() {
	System.out.println("--Close the Browser");
}

@AfterSuite()
public void configAS() {
	System.out.println("--Disconnect to DB--");
}

@Test(priority = -1)
public void test() {
	System.out.println("--Test Scripts execution starts 2--");
}

}
