package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GrowthEngineeringLocators {
	
	@FindBy(xpath = "//*[@class='elementor-item has-submenu' and text()=\"Our Products\"]")
	public WebElement OurProducts;
	
	@FindBy(xpath = "//*[@class='elementor-item has-submenu' and text()=\"Our Approach\"]")
	public WebElement OurApproach;
	
	@FindBy(xpath = "//*[@class='elementor-item has-submenu' and text()=\"Resources\"]")
	public WebElement Resources;
	
	@FindBy(xpath = "//*[@class='elementor-item has-submenu' and text()=\"About Us\"]")
	public WebElement AboutUs;
	
	
	@FindBy(xpath = "//span[@class = 'elementor-button-text' and text()='GET IN TOUCH']")
	public WebElement Getintouch;
	
	@FindBy(xpath = "//*[@class='hs-input']/following-sibling::span[text()='Full name']")
	public WebElement fullnametext;
	

}
