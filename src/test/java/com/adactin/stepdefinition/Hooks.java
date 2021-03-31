package com.adactin.stepdefinition;

import java.io.IOException;

import CUCU.CucumberTest.Baseclass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Baseclass{

	@Before
	public static void beforeHooks(Scenario scenario) {

		String status = scenario.getName();
		System.out.println(status);
	}
	
	@After
	public static void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println(status);
		
		if (scenario.isFailed()) {
			takeScreenshot("FailedScenario ="+ scenario.getName());
		}
	}
}
