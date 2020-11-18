package StepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksInCucumber {
	
	
	//Before------it will run before each scenario (in each feature file or whatever feature file u will give runner class)
	//After-------it will run before each scenario (in each feature file or whatever feature file u will give runner class)
	//Before and After hooks are like @BeforeMethod in testng
	
	
	//Background ---it will run only for the sceanrios written in that feature file. (eg in redBusHomePage we have written)
	
	
	@Before
	public void launchDriver() {
		//It will run before each sceanrio
		
		System.out.println("In Before Hook");
	}
	
	@After
	public void closeDriver() {
		//It will run after each scenario
		System.out.println("In After Hook");
	}

}
