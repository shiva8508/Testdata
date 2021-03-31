package com.adactin.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public static WebDriver driver;

	@FindBy(id="username")
	private WebElement username;

	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;

	
	public HomePage(WebDriver ldriver) {
       this.driver=ldriver;
      PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	}

