package init;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;

import pageObject.JQueryUIHomepageObject;


public class TestInitiator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestInitiator.class);
	
	public static WebDriver driver;
	
	public static JQueryUIHomepageObject homepage;
	
	public static void launchBrowser() throws IOException {
		LOGGER.info("launching driver");
		driver = WebDriverIniator.driverLaunch();
		LOGGER.info("creating page object");
		pageObjects();
	}
	
	public static void pageObjects() {
		LOGGER.info("Creating objects of pages");
		homepage = new JQueryUIHomepageObject(driver);
	}
	
	public static void closeBrowser() {
		LOGGER.info("Closing Driver");
		driver.close();
	}

}
