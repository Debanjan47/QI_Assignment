package com.cucumberFramework.helper;

import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class TakeScreenshot {
	@Test

    public void TakeScreenShot() throws Exception{

		WebDriver driver ;
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
    	driver = new FirefoxDriver();

        //goto url

        driver.get("https://www.growthengineering.co.uk/");

        //Call take screenshot function

        this.takeSnapShot(driver, "c://test.png") ;     

    }

    /**

     * This function will take screenshot

     * @param webdriver

     * @param fileWithPath

     * @throws Exception

     */

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }

}
