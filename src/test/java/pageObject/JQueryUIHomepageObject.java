package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class JQueryUIHomepageObject {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JQueryUIHomepageObject.class);
	
	//Functions
	
	public WebDriver driver;
	
	public JQueryUIHomepageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Demos']")
	public WebElement demosTab;
	
	@FindBy(css="(//a[text()='Learning Center'])[1]") //done intentionally css instead of xpath
	public WebElement learningCenter;
	
	@FindBy(xpath="(//a[text()='CLA'])[1]")
	public WebElement CLA;
	
	public void launchHomePage() {
		LOGGER.info("launching homepage url");
		driver.get("https://jqueryui.com/");
	}
	
	public String fetchTitle() {
		LOGGER.info("Title = "+ driver.getTitle());
		return driver.getTitle();
	}

	public void demoTabCheck() {
		Assert.assertEquals(demosTab.getText(), "Demos");
	}

	public void downloadTabCheck() {
		// TODO Auto-generated method stub
		
	}

	public void apiDocumentationTabCheck() {
		// TODO Auto-generated method stub
		
	}

	public void themeTabCheck() {
		// TODO Auto-generated method stub
		
	}

	public void developmentTabCheck() {
		// TODO Auto-generated method stub
		
	}

	public void supportTabCheck() {
		// TODO Auto-generated method stub
		
	}

	public void blogTabCheck() {
		// TODO Auto-generated method stub
		
	}

	public void aboutTabCheck() {
		// TODO Auto-generated method stub
		
	}

	public void mouseHover(String string) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//a[text()='"+string+"'])[1]"))).build().perform();
		Thread.sleep(2000);
	}

	public void clickTab(String string) {
		if(string.equals("Learning Center")) {
			learningCenter.click();
		} else if(string.equals("CLA")) {
			CLA.click();
		}
	}

	public void checkURL(String string) {
		Assert.assertTrue(driver.getCurrentUrl().contains(string));
	}

}
