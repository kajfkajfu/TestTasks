package web.calculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebCalcTest {
    private final String CSS_SELECTOR = "form > h2";
    private final int THREAD_SLEEP_TIME = 3000;

    WebCalc webCalc = new WebCalc();

    @Test(description = "testing the addition of two numbers")
    void additionTest() throws InterruptedException {
        webCalc.addition(10, 5);
        Thread.sleep(THREAD_SLEEP_TIME);
        String actual = webCalc.DRIVER.findElement(By.cssSelector(CSS_SELECTOR)).getText();
        String expected = "15";
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "testing the division of two numbers")
    void divideTest() throws InterruptedException {
        webCalc.divide(10, 5);
        Thread.sleep(THREAD_SLEEP_TIME);
        String actual = webCalc.DRIVER.findElement(By.cssSelector(CSS_SELECTOR)).getText();
        String expected = "2";
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "testing finding modulo of two numbers")
    void moduloTest() throws InterruptedException {
        webCalc.modulo(5, 10);
        Thread.sleep(THREAD_SLEEP_TIME);
        String actual = webCalc.DRIVER.findElement(By.cssSelector(CSS_SELECTOR)).getText();
        String expected = "5";
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "testing multiplication of two numbers")
    void multiplicationTest() throws InterruptedException {
        webCalc.multiplication(10, 5);
        Thread.sleep(THREAD_SLEEP_TIME);
        String actual = webCalc.DRIVER.findElement(By.cssSelector(CSS_SELECTOR)).getText();
        String expected = "50";
        Assert.assertEquals(actual, expected);
    }
}
