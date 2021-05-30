package com.cucumberFramework.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QA_AutomationpageLocators {

	private WebDriver driver;
	
	@FindBy(xpath="//*[contains(text()='Got it, do not show again')]")
	public WebElement dontshowagain;
	
	@FindBy(xpath="//span[@class='topView_text']|//*[contains(text()='COVID-19 Test Providers')]")
	public WebElement covid19testprovidertab;
	
	@FindBy(xpath="//span[@class='topView_text']|//*[contains(text()='Nearby Parks')]")
	public WebElement nearbyparks;
	
	@FindBy(xpath="//span[@class='topView_text']|//*[contains(text()='Essential Amenities (2km)')]")
	public WebElement essential_amenities;
	
	@FindBy(xpath="//span[@class='topView_text']|//*[contains(text()='SchoolQuery')]")
	public WebElement schoolquery;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-md ShowSecSchool']|//*[contains(text()='Find Secondary School Information')]")
	public WebElement findsecondaryschool;
	
	@FindBy(xpath = "//label[@for='themeCheckbox0']")
	public WebElement download;
	
	@FindBy(id = "search-text")
	public WebElement searchbox;
	
	@FindBy(xpath="//*[@class='latlong']")
	public WebElement coordinates;
	
	@FindBy(xpath = "//*[contains(text()='OK']")
	public WebElement clickOK;
	
	@FindBy(xpath = "//*[contains(text()='Download']")
	public WebElement downloadButton;
	
	@FindBy(xpath = "//*[contains(text()='OK']")
	public WebElement I_Agree;
	
	@FindBy(xpath = "//*[contains(text()='No location selected. Please enter location in search box to find schools near a building.']")
	public WebElement No_location_error;
	
	@FindAll(@FindBy(how = How.XPATH, using = "//*[contains(@class,'DroneThemeNames ng-binding')]"))
	public List<WebElement> allEssentialAmenities;
}
