package StepDefination;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import init.TestInitiator;
import pageObject.JQueryUIHomepageObject;
import reporting.ReportingClass;

public class JQueryUIHomepage extends TestInitiator{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JQueryUIHomepage.class);
	
	//I will impelemnt all homepage steps in this file
	
	
	//Function calling + assertions
	
	
	@Given("Launch URL of homepage")
	public void launch_URL_of_homepage() throws Throwable {
		LOGGER.info("In StepDef calling launchHomepage function");
		
		try {
		homepage.launchHomePage();
		ReportingClass.infoLogPass("Launch URL of homepage");
		}catch(Exception e) {
			ReportingClass.reportFailure("Launch URL of homepage", TestInitiator.driver);
		}
	}

	@Then("I verify title of homepage")
	public void i_verify_title_of_homepage() throws Throwable {
		LOGGER.info("IN Stepdef checking title");
		
		try {
		Assert.assertEquals(homepage.fetchTitle(), "jQuery UI");
		ReportingClass.infoLogPass("I verify title of homepage");
		}catch(Exception e) {
			ReportingClass.reportFailure("I verify title of homepage", TestInitiator.driver);
		}
	}
	
	@Then("I verify below mentioned header tabs:")
	public void i_verify_below_mentioned_header_tabs(io.cucumber.datatable.DataTable dataTable) throws Throwable {
		
		try {
		List<String> list = dataTable.asList();
		
		for(String e: list) {
			
			if(e.equalsIgnoreCase("Demos")) {
				homepage.demoTabCheck();
			} else if(e.equalsIgnoreCase("Download")) {
				homepage.downloadTabCheck();
			} else if(e.equalsIgnoreCase("API Documentation")) {
				homepage.apiDocumentationTabCheck();
			} else if(e.equalsIgnoreCase("Themes")) {
				homepage.themeTabCheck();
			} else if(e.equalsIgnoreCase("Development")) {
				homepage.developmentTabCheck();
			} else if(e.equalsIgnoreCase("Support")) {
				homepage.supportTabCheck();
			} else if(e.equalsIgnoreCase("Blog")) {
				homepage.blogTabCheck();
			} else if(e.equalsIgnoreCase("About")) {
				homepage.aboutTabCheck();
			}
		}
		ReportingClass.infoLogPass("I verify below mentioned header tabs:");
		}catch(Exception e) {
			ReportingClass.reportFailure("I verify below mentioned header tabs:", TestInitiator.driver);
		}
	}
	
	@Given("I hover mouse cursor over {string} tab")
	public void i_hover_mouse_cursor_over_tab(String string) throws Throwable {
		
		try {
		homepage.mouseHover(string);
		ReportingClass.infoLogPass("I hover mouse cursor over {string} tab");
		}catch(Exception e) {
			ReportingClass.reportFailure("I hover mouse cursor over {string} tab", TestInitiator.driver);
		}
	}

	@Given("I click on {string}")
	public void i_click_on(String string) throws Throwable {
		
		try {
			
			homepage.clickTab(string);
			ReportingClass.infoLogPass("I click on {string}");
			}catch(Exception e) {
				ReportingClass.reportFailure("I click on {string}", TestInitiator.driver);
			}
	}
	
	

	@Then("I verify the url which contains {string}")
	public void i_verify_the_url_which_contains(String string) throws Throwable {
		
		try {
			homepage.checkURL(string);
			ReportingClass.infoLogPass("I verify the url which contains {string}");
			}catch(Exception e) {
				ReportingClass.reportFailure("I verify the url which contains {string}", TestInitiator.driver);
			}
	}
	

}
