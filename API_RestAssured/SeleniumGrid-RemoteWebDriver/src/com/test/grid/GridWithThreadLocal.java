package com.test.grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridWithThreadLocal {

	private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();
	private static ThreadLocal<DesiredCapabilities> dc = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return dr.get();
	}

	static void setDriver(WebDriver driver) {
		dr.set(driver);
	}

	static void unloadDriver() {
		dr.remove();
	}

	public static DesiredCapabilities getDesiredCapabilities() {
		return dc.get();
	}

	static void setDesiredCapabilities(DesiredCapabilities cap) {
		dc.set(cap);
	}

	static void unloadCapabilities() {
		dc.remove();
	}

	public void openBrowser(String browser) throws MalformedURLException {
		DesiredCapabilities capability = null;
		WebDriver driver = null;
		ChromeOptions options;
		if (Objects.isNull(getDriver()) && browser.equalsIgnoreCase("chrome")) {
			capability = new DesiredCapabilities();
			setDesiredCapabilities(capability);
			capability.setBrowserName("chrome");
			capability.setPlatform(Platform.WINDOWS);

			options = new ChromeOptions();
			options.merge(capability);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
			setDriver(driver);

		}
		if (Objects.isNull(getDriver()) && browser.equalsIgnoreCase("firefox")) {
			capability = new DesiredCapabilities();
			setDesiredCapabilities(capability);
			capability.setBrowserName("firefox");
			capability.setPlatform(Platform.WINDOWS);
			FirefoxOptions option = new FirefoxOptions();
			option.merge(capability);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
			setDriver(driver);

		}

		launchURL();
	}

	public void launchURL() {
		getDriver().get("https://google.com");
	}

	public void quitDriver() {
		if (Objects.nonNull(getDriver())) {
			getDriver().quit();
			unloadDriver();
		}

	}

	@Parameters({ "browser" })
	@Test
	public void searchGoogle(String browser) throws MalformedURLException, InterruptedException {
		openBrowser(browser);
		launchURL();
		getDriver().findElement(By.name("q")).sendKeys("Selenium Automation" + Keys.ENTER);
		Thread.sleep(5000);
		quitDriver();
	}

}
