package base;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ConfigReader;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public static void setupDriver() {

        String browser = ConfigReader.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {

           // WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(ConfigReader.getProperty("base.url"));

    }

    public static void quitDriver() {

        if (driver != null) {

            driver.quit();

        }

    }

}