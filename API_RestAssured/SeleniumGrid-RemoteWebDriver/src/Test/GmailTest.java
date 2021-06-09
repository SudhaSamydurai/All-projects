package Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GmailTest {

	@Parameters({ "browser" })
	@Test
	void openGmail(String browser) {

		DesiredCapabilities capbality = null;
		RemoteWebDriver driver = null;

		if (browser.equalsIgnoreCase("chrome")) {
			capbality = DesiredCapabilities.chrome();
			capbality.setBrowserName("chrome");
			capbality.setPlatform(Platform.WINDOWS);
		} else if (browser.equalsIgnoreCase("firefox")) {
			capbality = DesiredCapabilities.firefox();
			capbality.setBrowserName("firefox");
			capbality.setPlatform(Platform.WINDOWS);
		}
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capbality);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		if (Objects.nonNull(driver)) {
			try {
				driver.get("https://gmail.com");
				driver.findElement(By.id("identifierId")).sendKeys("raman@gmail.com");
				driver.findElement(By.xpath("//span[normalize-space(text())='Next']")).click();
			} finally {
				driver.quit();
			}
		}

	}
}
