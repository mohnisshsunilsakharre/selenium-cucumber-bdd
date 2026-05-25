package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;

    }

    By dashboardText = By.xpath("//h6[text()='Dashboard']");

    public boolean isDashboardVisible() {

        return driver.findElement(dashboardText).isDisplayed();

    }

}