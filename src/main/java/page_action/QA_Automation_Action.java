package page_action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.pageObjects.QA_AutomationpageLocators;


import org.openqa.selenium.TakesScreenshot;

public class QA_Automation_Action {
	
	QA_AutomationpageLocators loc = new QA_AutomationpageLocators();
	
	public void clickOK() {
		if(loc.clickOK.isDisplayed())
			loc.clickOK.click();
	}
	
	public void click_download() {
		loc.download.click();
		loc.downloadButton.click();
	}
	
	public boolean isFileDownloaded() throws Exception {
	    final int SLEEP_TIME_MILLIS = 1000;
	    File filedownloaddestination = new File("C:\\Users\\DEBANJAN\\Downloads");
	    final int timeout = 60* SLEEP_TIME_MILLIS;
	    int timeElapsed = 0;
	    String fileName = "nationalparks.kml";
	    while (timeElapsed<timeout){
	        if (filedownloaddestination.exists()) {
	            
				System.out.println(fileName + " is present");
	            return true;
	        } else {
	            timeElapsed +=SLEEP_TIME_MILLIS;
	            Thread.sleep(SLEEP_TIME_MILLIS);
	        }
	    }
	    return false;
	}

	public void click_covid_Testproviders() {
		loc.covid19testprovidertab.click();
		
			}
	
	public void search_for_name(String name) {
		loc.searchbox.click();
		loc.searchbox.sendKeys(name);
		loc.searchbox.sendKeys(Keys.ENTER);
	}
	
	public void fetch_coordinates() {
		String coordinates = loc.coordinates.getText();
		System.out.println(">> The Coordinates are" + coordinates);
	}
	
	public void click_nearbyParks() {
		loc.nearbyparks.click();
		clickOK();
	}
	
	public void click_schoolquery() {
		loc.schoolquery.click();
		}
	
	public void find_secondarySchool() {
		loc.findsecondaryschool.click();
	}
	
	public void clickIAgree() {
		loc.I_Agree.click();
	}
	
	public void nolocation_error() {
		Assert.assertTrue(">> No Location Found error message", loc.No_location_error.isDisplayed());
	}
	
	public void click_essentialAmenities() {
		loc.essential_amenities.click();
		clickOK();
	}
	
	public void select_EssentialAmenities() throws IOException {
		//String findATM;
		for(int i=0; i<loc.allEssentialAmenities.size(); i++) {
			WebElement findATM = loc.allEssentialAmenities.get(i);
			if(findATM.getText()=="ATMs") {
				findATM.click();
			}
		}
		System.out.println(">> ATMs found");
		WebDriver webdriver = null;
		
		File scrShot =((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		 File DestFile=new File("C:\\Users\\DEBANJAN\\eclipse-workspace\\Cucumber-BDD-Automation-Framework-master\\target");
		 FileUtils.copyFile(scrShot, DestFile);
	}
}
