package stepdefinitions;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;

import static org.testng.Assert.assertTrue;

public class LoginSteps extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;

    @Given("User launches OrangeHRM login page")
    public void launchApplication() {

        setupDriver();
        loginPage = new LoginPage(driver);

    }

    @When("User enters valid username and password")
    public void enterCredentials() {

        loginPage.enterUsername(ConfigReader.getProperty("username"));
        loginPage.enterPassword(ConfigReader.getProperty("password"));

    }

    @And("User clicks login button")
    public void clickLogin() {

        loginPage.clickLogin();

    }

    @Then("User should be navigated to dashboard")
    public void verifyDashboard() {

        homePage = new HomePage(driver);

        assertTrue(homePage.isDashboardVisible());

    }

    @After
    public void tearDown() {

        quitDriver();

    }

}