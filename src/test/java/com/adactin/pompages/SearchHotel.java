package com.adactin.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class SearchHotel {

	public static WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomstype;
	
	@FindBy(id = "room_nos")
	private WebElement numOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement datePickIn;
	
	@FindBy(id ="datepick_out")
	private WebElement datePickOut;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	
	
	public SearchHotel(WebDriver sdriver) {
		this.driver=sdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomstype() {
		return roomstype;
	}

	public WebElement getNumOfRooms() {
		return numOfRooms;
	}

	public WebElement getDatePickIn() {
		return datePickIn;
	}

	public WebElement getDatePickOut() {
		return datePickOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearch() {
		return search;
}
}