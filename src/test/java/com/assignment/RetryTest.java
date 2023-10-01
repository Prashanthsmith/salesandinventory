package com.assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesandinventory.generic.BaseClass;

public class RetryTest extends BaseClass{

	@Test(retryAnalyzer = com.salesandinventory.generic.RetryImpliment.class)
	public void ret()
	{
		Assert.assertEquals("a", "b");
	}
}
