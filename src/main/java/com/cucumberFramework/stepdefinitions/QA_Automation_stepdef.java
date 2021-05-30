package com.cucumberFramework.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.LoginLogoutPage;
import com.cucumberFramework.pageObjects.QA_AutomationpageLocators;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.Scenario;
import page_action.QA_Automation_Action;

public class QA_Automation_stepdef {
	
	ServiceHooks serverlogs = new ServiceHooks();
	QA_Automation_Action Action = new QA_Automation_Action();
	WebDriver driver;
	public static Scenario tags;
	Scenario tag1;
	Scenario tag4;
	QA_AutomationpageLocators locators = new QA_AutomationpageLocators();
	
	@Given("^I want launch url \"([^\"]*)\"$")
	public void I_want_launch_url(String url) throws Throwable {
		driver.get(url);
		//waitHelper = new WaitHelper(driver);
		driver.wait(2000);
		if(locators.dontshowagain.isDisplayed()) {
			locators.dontshowagain.click();
		}
	}
	
	@When("^I click on COVID19 Test Providers$")
	public void I_click_on_COVID19_Test_Providers() throws Throwable {
		Action.click_covid_Testproviders();
		serverlogs.initializeTest();
		}

	@Then("^I fetch the coordinates of the location$")
	public void I_want_fetch_the_coordinates_of_the_location() throws Throwable {
		Action.fetch_coordinates();
		serverlogs.endTest((cucumber.api.Scenario) tag1);
	}
	
	@Then("^I validate whether No location selected error message is visible$")
	public void I_validate_whether_No_location_selected_error_message_is_visible() throws Throwable {
		Action.nolocation_error();
		serverlogs.endTest((cucumber.api.Scenario) tag4);
	}
	
	@Then("^I validate whether file is downloaded$")
	public void I_validate_whether_file_is_downloaded() throws Throwable {
		Action.isFileDownloaded();
		
	}

	@When("^I search for name \"([^\"]*)\"$")
	public void I_search_for_name(String name) throws Throwable {
	Action.search_for_name(name);
	}
	
	@When("^I click on Nearby parks$")
	public void I_click_on_Nearby_parks() throws Throwable {
		Action.click_nearbyParks();
	}
	
	@When("^I click on Essential Amenities$")
	public void I_click_on_Essential_Amenities() throws Throwable {
		Action.click_essentialAmenities();
	}
	
	@When("^I click on ATMs, Bank Branches buttons$")
	public void I_click_on_ATMs_Bank_Branches_buttons() throws Throwable {
		Action.select_EssentialAmenities();
	}
	
	@When("^I click on School Query$")
	public void I_click_on_School_Query() throws Throwable {
		Action.click_schoolquery();
	}
	
	@When("^I click on Find Secondary School information$")
	public void I_click_on_Find_Secondary_School_information() throws Throwable {
		Action.find_secondarySchool();
	}
	@When("^I click on I Agree$")
	public void I_click_on_I_Agree()  {
		Action.clickIAgree();
	}
	
	@When("^I select the option and click download$")
	public void I_select_the_option_and_click_download()  {
		Action.click_download();
	}
}
