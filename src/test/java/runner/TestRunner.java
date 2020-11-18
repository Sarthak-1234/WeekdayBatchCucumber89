package runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import init.TestInitiator;

@CucumberOptions(
		features="src/test/resources/tests",     //where your feature file resides---if you will give particular feature file then it will run only that one.
		glue= {"StepDefination"},   //where you have your implementations
		dryRun = false,				//it verifies that all steps has been implemented or not
		monochrome = true,			//gives u detailed description in console
		plugin = {"pretty","html:target", "json:target/cucumber.json", "junit:target/cucumber.xml"},
		tags= {"@run"}
				
)

@RunWith(Cucumber.class)
public class TestRunner {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestInitiator.class);
	
	//tags= {"@Regression, @Smoke"}  ---> it will run testcases which have either regression or smoke or both
	//tags= {"@Regression", "@Smoke"} ---> it will run testcases which have both regression and smoke
	
	@BeforeClass
	public static void initation() throws IOException {
		LOGGER.info("In BeforeClass of runner file");
		TestInitiator.launchBrowser();
	}
	
	@AfterClass
	public static void afterclass() {
		TestInitiator.closeBrowser();
	}
	
	
}
