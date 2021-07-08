package com.cucumberFramework.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_action.GrowthEngineeringAction;

import org.openqa.selenium.WebDriver;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.testBase.TestBase;

public class GrowthEngineering_Stepdef {
	ServiceHooks serverlogs = new ServiceHooks();
	GrowthEngineeringAction actiononj = new GrowthEngineeringAction();
	WebDriver driver;
	WaitHelper waitHelper = new WaitHelper(driver);
		
	@When("^I hover on the top menus validate the menus work$")
	public void I_hover_on_the_top_menus_validate_the_menus_work() throws Throwable {
		actiononj.validate_menus();
	}
	
	@When("^Navigate to new url \"([^\"]*)\"$")
	public void Navigate_to_new_url(String url2) throws Throwable {
		driver.get(url2);
		
	}
	
	@Then("^validate all fields accept correct values$")
	public void validate_all_fields_accept_correct_values() throws Throwable {
		actiononj.validate_form();
	}
	

}
