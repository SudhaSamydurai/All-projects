package ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportTest {

	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	WebDriver driver;

	@BeforeSuite
	public void setUp() {
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver.get("https://www.google.com");
	}

	@Test
	public void extentReportDemo_2() throws IOException {

		ExtentTest test = extent.createTest("Test 2").assignAuthor("Shivaani").assignCategory("Regression")
				.assignDevice("chrome");

		test.pass("Browser is opened");
		driver.findElement(By.name("q")).sendKeys("Extent Reports", Keys.ENTER);
//		test.pass("Google Search is successful",
//				MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotPath()).build());

		test.pass("Google Search is successful",
				MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshotPathAsBase64()).build());
		test.info("Info 1 added");
		test.pass(MarkupHelper.createLabel("Step 3", ExtentColor.GREEN));
		test.fail(MarkupHelper.createLabel("test case failed", ExtentColor.RED));

	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
		try {
			Desktop.getDesktop().browse(new File("target/Spark.html").toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

	public String getScreenshotPath() throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/Screenshot/image.png";
		FileUtils.copyFile(file, new File(path));
		return path;
	}

	public String getScreenshotPathAsBase64() throws IOException {

		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}
}
