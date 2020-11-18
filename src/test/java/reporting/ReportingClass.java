package reporting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import runner.TestRunner;
import utils.TakeScreenshots;

public class ReportingClass {

	
	public static ExtentReports report = TestRunner.report;  //html report
	public static ExtentTest test;  //instantiate
	public static TakeScreenshots screencapture;
	
	
	
	
	//start-----ReportingClass.initReports("LOGIN")
	//pass -----ReportingClass.infoLogPass("PASS");
	//fail ------ReportingClass.reportFailure("", InitiateTest.driver)
	//skip -----ReportingClass.infoLogMessage("Intentionally skipping")
	//AfterSuite ---ReportingClass.putReport();

	//Whenever testcase fail..call reportFailure
	public static void reportFailure(String errMsg, WebDriver driver) throws Throwable {
    	screencapture = new TakeScreenshots(driver);
		ReportingClass.infoLogFail(errMsg);
	}
	
	
	//jaise hi testcase start hoga
	public static void initScenario(String testcasename) {
		test = report.createTest(testcasename);
		
	}
	
	public static void putReport() {
		report.flush(); //publish reports
	}
	
	public static void infoLogPass(String msg) {
		test.log(Status.PASS, msg);
	}
	
	public static void infoLogFail(String msg) throws IOException, Exception {
		test.log(Status.FAIL,msg +" Screenshot-> "+ test.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath+screencapture.TakeScreenshot()));
		Assert.assertFalse(true);
	}
	
	public static void infoLogMessage(String msg) {
		test.log(Status.INFO, msg);
	}
	
	public static void infoLogSkip(String msg) {
		test.log(Status.SKIP, msg);
	}	

}
