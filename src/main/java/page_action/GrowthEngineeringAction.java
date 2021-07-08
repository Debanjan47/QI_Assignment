package page_action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.cucumberFramework.helper.TakeScreenshot;
import com.cucumberFramework.pageObjects.GrowthEngineeringLocators;

import jdk.internal.org.jline.utils.Log;

public class GrowthEngineeringAction {
	WebDriver driver;
	
	TakeScreenshot screenclip = new TakeScreenshot();
	Actions actions = new Actions(driver);
	
	GrowthEngineeringLocators loc = new GrowthEngineeringLocators();
	
	public void validate_menus() throws Exception {
		Assert.assertTrue(loc.OurProducts.isDisplayed());
		actions.moveToElement(loc.OurProducts).perform();//hover on the Our products menu
		screenclip.TakeScreenShot();
		
		Assert.assertTrue(loc.OurApproach.isDisplayed());
		actions.moveToElement(loc.OurApproach).perform();
		screenclip.TakeScreenShot();
		
		Assert.assertTrue(loc.Resources.isDisplayed());
		actions.moveToElement(loc.Resources).perform();
		screenclip.TakeScreenShot();
		
		Assert.assertTrue(loc.AboutUs.isDisplayed());
		actions.moveToElement(loc.AboutUs).perform();
		screenclip.TakeScreenShot();
		
		Assert.assertTrue(loc.Getintouch.isDisplayed());
		actions.moveToElement(loc.Getintouch).perform();
		screenclip.TakeScreenShot();
	}
	
	public void validate_form() {
		if(loc.fullnametext.isDisplayed()) {
			loc.fullnametext.sendKeys("Name1");//passing Name as Name1
		}
		else
			Log.info(">> Improper Text field");
	}//Similarly we will be validating all the text fields and elements of the given form
}
