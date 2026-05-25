package hooks;

import com.aventstack.extentreports.ExtentTest;

import base.BaseTest;
import base.ExtentReportManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ScreenshotUtil;

public class Hooks extends BaseTest {

	public static ExtentTest test;

	@Before
	public void setup(Scenario scenario) {

		setupDriver();

		test = ExtentReportManager.getInstance().createTest(scenario.getName());
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			String path = ScreenshotUtil.captureScreenshot(driver, scenario.getName());
			test.fail("Test Failed").addScreenCaptureFromPath(path);
		} else {

			test.pass("Test Passed");
		}

		quitDriver();

		ExtentReportManager.getInstance().flush();
	}
}