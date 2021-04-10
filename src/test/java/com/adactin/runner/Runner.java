package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;

import CUCU.CucumberTest.Baseclass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", 
                  glue = "com\\adactin\\stepdefinition", 
                  monochrome = true, 
                  dryRun = false, 
                  strict = true,
                   plugin = {"html:runner.html","pretty","json :reports/JsonReport.json",
                		   "com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/CucumberReport.html",
                		   "rerun:rerunREports/FailedScenario.txt"})

public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException {

		String browser = FileReaderManager.getInstsance().getCrInstance().getBrowser();
		driver = Baseclass.BrowserLunch(browser);
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
