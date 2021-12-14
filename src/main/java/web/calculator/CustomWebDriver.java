package web.calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWebDriver {
    protected WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "D://ChromeDriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://juliemr.github.io/protractor-demo/");
        return driver;
    }
}
