package StepDefination;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import reporting.ReportingClass;

public class HooksInCucumber {
	
	
	//Before------it will run before each scenario (in each feature file or whatever feature file u will give runner class)
	//After-------it will run before each scenario (in each feature file or whatever feature file u will give runner class)
	//Before and After hooks are like @BeforeMethod in testng
	
	
	//Background ---it will run only for the sceanrios written in that feature file. (eg in redBusHomePage we have written)
	
	
	//If you want to get the sceanrio name?? ----hooks Scenario constructor
	
	@Before
	public void launchDriver(Scenario scName) {
		//It will run before each sceanrio
		
		System.out.println("In Before Hook");
		ReportingClass.initScenario(scName.getName());
		
		//On test start in listern ----we are doing that in before hook
	}
	
	@After
	public void closeDriver() {
		//It will run after each scenario
		System.out.println("In After Hook");
	}

}
