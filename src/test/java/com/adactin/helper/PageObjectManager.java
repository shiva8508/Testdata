package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pompages.HomePage;
import com.adactin.pompages.SearchHotel;
import com.adactin.pompages.SelectHotel;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private HomePage hp;
	
	private SearchHotel sh;
	
	private SelectHotel hl;
	
	public PageObjectManager(WebDriver pdriver) {
		this.driver=pdriver;
		PageFactory.initElements(driver, this);
	
	}


	public HomePage getHp() {
		hp= new HomePage(driver);
		return hp;
	}

	public SearchHotel getSh() {
		sh = new SearchHotel(driver);
		return sh;
	}

	public SelectHotel getHl() {
		hl = new  SelectHotel(driver);
		return hl;
	}


	
}
