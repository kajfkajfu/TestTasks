package web.calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class CustomWebDriver {
    private static final String SEP = File.separator;

    private static final String PATH_TO_CHROME_DRIVER = "src" + SEP + "main"
            + SEP + "resources" + SEP + "chromedriver.exe";
    private static final String WEB_DRIVER_CHROME = "webdriver.chrome.driver";
    private static final String WEB_SITE_URL = "https://juliemr.github.io/protractor-demo/";

    /**
     * Returns WebDriver element
     */
    protected WebDriver getDriver() {
        System.setProperty(WEB_DRIVER_CHROME, PATH_TO_CHROME_DRIVER);
        WebDriver driver = new ChromeDriver();
        driver.get(WEB_SITE_URL);
        return driver;
    }
}
