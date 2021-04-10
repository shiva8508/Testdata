package com.adactin.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pompages.HomePage;
import com.adactin.pompages.SearchHotel;
import com.adactin.pompages.SelectHotel;
import com.adactin.runner.Runner;

import CUCU.CucumberTest.Baseclass;
import cucumber.api.java.en.*;

public class LoginStepDifinition extends Baseclass {

	public static WebDriver driver = Runner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User luanch application$")
	public void user_luanch_application() throws Throwable {
		String url = FileReaderManager.getInstsance().getCrInstance().getUrl();
		getUrl(url);
	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		//screenshot("skdhfajsdn");
		sendKeys(pom.getHp().getUsername(), arg1);
	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
		
		sendKeys(pom.getHp().getPassword(), arg1);

	}

	@Then("^User verify valid username and valid password$")
	public void user_verify_valid_username_and_valid_password() throws Throwable {
		click(pom.getHp().getLogin());
	}

	@When("^User choose the \"([^\"]*)\" in location$")
	public void user_choose_the_in_location(String arg1) throws Throwable {
		dropDown(pom.getSh().getLocation(), "text", arg1);
	}

	@When("^user choose the \"([^\"]*)\" in hotels$")
	public void user_choose_the_in_hotels(String arg1) throws Throwable {
		dropDown(pom.getSh().getHotels(), "text", arg1);
	}

	@When("^user choose the \"([^\"]*)\" selected in room type$")
	public void user_choose_the_selected_in_room_type(String arg1) throws Throwable {
		dropDown(pom.getSh().getRoomstype(), "text", arg1);
	}

	@When("^user choose the \"([^\"]*)\" selected in number of rooms$")
	public void user_choose_the_selected_in_number_of_rooms(String arg1) throws Throwable {
		dropDown(pom.getSh().getNumOfRooms(), "value", arg1);
	}

	@When("^User enter \"([^\"]*)\" as datepick$")
	public void user_enter_as_datepick(String arg1) throws Throwable {
		sendKeys(pom.getSh().getDatePickIn(), arg1);
		Assert.assertEquals("ksd", "dsdfj");
	}

	@When("^User enter \"([^\"]*)\" as dateout$")
	public void user_enter_as_dateout(String arg1) throws Throwable {
		sendKeys(pom.getSh().getDatePickOut(), arg1);
	}

	@When("^user choose the \"([^\"]*)\" selected in adults room$")
	public void user_choose_the_selected_in_adults_room(String arg1) throws Throwable {
		dropDown(pom.getSh().getAdultRoom(), "index", arg1);
		//takeScreenshot("error");
	}

	@When("^user choose the \"([^\"]*)\" in child room$")
	public void user_choose_the_in_child_room(String arg1) throws Throwable {
		dropDown(pom.getSh().getChildRoom(), "index", arg1);
	}

	@Then("^user verify the given options$")
	public void user_verify_the_given_options() throws Throwable {
		click(pom.getSh().getSearch());
	}

	SelectHotel hl = new SelectHotel(driver);

	@When("^User want to click the radio batten$")
	public void user_want_to_click_the_radio_batten() throws Throwable {
		click(pom.getHl().getRadio_btn());
	}

	@Then("^User want to continue the page$")
	public void user_want_to_continue_the_page() throws Throwable {
		click(pom.getHl().getCont());
		//Assert.assertEquals("ABC", "abc");
	}
}
