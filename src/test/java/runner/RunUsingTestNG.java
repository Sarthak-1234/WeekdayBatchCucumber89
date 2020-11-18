package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import init.TestInitiator;
import reporting.ExtentManager;
import reporting.ReportingClass;

@CucumberOptions(
		//features = "src/test/resources/functionalTestCases/GoogleHomePage.feature",
			dryRun = false,
			features = "src/test/resources/functionalTestCases/MMTHomePage.feature",	
			glue = {"stepDefination"},
			monochrome = true,
			//plugin = {"json:target/cucumber.json"},
			
			plugin = {"pretty","html:target", "json:target/cucumber.json", "junit:target/cucumber.xml"}
			//tags="@run"
			
			//if we want to run all tags except smoke
			//tags="~@Smoke"
	)
public class RunUsingTestNG extends AbstractTestNGCucumberTests{

	
	public static ExtentReports report;
	
	@BeforeClass
	public static void beforeClass() {
		report = ExtentManager.setUp("Extent_Reports");
	}
	
	@AfterClass
	public static void afterClass() {
		TestInitiator.driver.close();
		ReportingClass.putReport();
	}
	
}
