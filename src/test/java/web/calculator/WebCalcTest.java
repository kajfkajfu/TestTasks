package web.calculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import web.calculator.WebCalc;

public class WebCalcTest {
    WebCalc webCalc = new WebCalc();

    @Test
    void additionTest() throws InterruptedException {
        webCalc.addition(10, 5);
        Thread.sleep(3000);
        String actual = webCalc.DRIVER.findElement(By.cssSelector("form > h2")).getText();
        String expected = "15";
        Assert.assertEquals(actual, expected);
    }

    @Test
    void divideTest() throws InterruptedException {
        webCalc.divide(10, 5);
        Thread.sleep(3000);
        String actual = webCalc.DRIVER.findElement(By.cssSelector("form > h2")).getText();
        String expected = "2";
        Assert.assertEquals(actual, expected);
    }

    @Test
    void moduloTest() throws InterruptedException {
        webCalc.modulo(5, 10);
        Thread.sleep(3000);
        String actual = webCalc.DRIVER.findElement(By.cssSelector("form > h2")).getText();
        String expected = "5";
        Assert.assertEquals(actual, expected);
    }

    @Test
    void multiplicationTest() throws InterruptedException {
        webCalc.multiplication(10, 5);
        Thread.sleep(3000);
        String actual = webCalc.DRIVER.findElement(By.cssSelector("form > h2")).getText();
        String expected = "50";
        Assert.assertEquals(actual, expected);
    }
}
