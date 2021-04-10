package CUCU.CucumberTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;

	public static WebDriver BrowserLunch(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver1.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void action() {
		Actions ac = new Actions(driver);

	}

	public static void robot() throws AWTException {
		Robot r = new Robot();
	}

	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		File source = new File(System.getProperty("user.dir") + "\\screenshot" + name + ".png");
		FileUtils.copyFile(f, source);
	}

	public static void getTitle() {
		driver.getTitle();

	}

	public static void close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();

	}

	public static void navigateTo(String name) {
		driver.navigate().to(name);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {

		driver.navigate().forward();

	}

	public static void getText(WebElement text) {
		text.getText();

	}

	public static void getCurrentUrl() {
		driver.getCurrentUrl();
	}

	public static void alertOk() {
		driver.switchTo().alert().accept();

	}

	public static void getAttribute(WebElement At, String value) {
		At.getAttribute(value);
	}

	public static void click(WebElement sub) {
		sub.click();
	}

	public static void sendKeys(WebElement key, CharSequence value) {
		key.sendKeys(value);
	}

	public static void dropDown(WebElement Element, String option, String value) {
		Select s = new Select(Element);
		try {
			if (option.equals("index")) {
				s.selectByIndex(Integer.parseInt(value));
			} else if (option.equals("value")) {
				s.selectByValue(value);
			} else if (option.equals("text")) {
				s.selectByVisibleText(value);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
