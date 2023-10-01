package com.assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesandinventory.generic.BaseClass;

public class Sample extends BaseClass {
	@Test(retryAnalyzer =  com.salesandinventory.generic.RetryImpliment.class)
	public void demo() {
		//Assert.assertEquals("a", "b");
		Assert.fail();
	}

}
