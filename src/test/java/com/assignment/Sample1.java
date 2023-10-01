package com.assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesandinventory.generic.BaseClass;

public class Sample1 extends BaseClass{

	@Test(groups = "smoke", retryAnalyzer = com.salesandinventory.generic.RetryImpliment.class)
	
	public void demo1() throws InterruptedException
	{
		Thread.sleep(5000);
		Assert.fail();
		System.out.println("Hi");
	}
}
