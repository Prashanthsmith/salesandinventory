package com.salesandinventory.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.exec.ExecuteException;
import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.repackage.Repackage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.annotations.IListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnersaImplementationclass  implements ITestListener{
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		//Actual TestScripts Execution starts from here..
		String Methodname = result.getMethod().getMethodName();
		test=report.createTest(Methodname);
		Reporter.log(Methodname+"---> Execution starts");


	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.PASS, methodname+"---> Passed");
		Reporter.log(methodname+"----> Testscript executed succesfully");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String Methodname = result.getMethod().getMethodName();
		String FailedScripts;
		try {
			FailedScripts = WebdriverUtility.takeScreenShot(BaseClass.sdriver, Methodname);
			test.addScreenCaptureFromPath(FailedScripts);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		test.log(Status.FAIL, result.getThrowable());
		test.log(Status.FAIL, Methodname+"-----Failed");
		Reporter.log(Methodname+"----->Failed");



	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String Methodname = result.getMethod().getMethodName();
		test.log(Status.SKIP,result.getThrowable());
		test.log(Status.SKIP, Methodname+"------- skipped");
		Reporter.log(Methodname+"----->Skipped");


	}

	@Override
	public void onStart(ITestContext context) {
		//create reports
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("./Extentreport/report.html");
		htmlreport.config().setDocumentTitle("Sales");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("Sales and inventory");

		report=new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("OS", "Windows11");
		report.setSystemInfo("Base-Browser", "chrome");
		report.setSystemInfo("Base-Url", "http\\://rmgtestingserver/domain/Sales_And_Inventory_System/pages/login.php");
		report.setSystemInfo("Reporter Name", "Prashanth");



	}

	@Override
	public void onFinish(ITestContext context) {

		report.flush();
	}


}
