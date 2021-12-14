package web.calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebCalc {
    private final CustomWebDriver WEB_DRIVER = new CustomWebDriver();
    public final WebDriver DRIVER = WEB_DRIVER.getDriver();
    private final WebElement NUMBER_ONE = DRIVER.findElement(By.xpath("/html/body/div/div/form/input[1]"));
    private final WebElement NUMBER_TWO = DRIVER.findElement(By.xpath("/html/body/div/div/form/input[2]"));
    private final WebElement GO_BUTTON = DRIVER.findElement(By.xpath("/html/body/div/div/form/button"));
    private final WebElement ADDITION_BUTTON = DRIVER.findElement(By.xpath("/html/body/" +
            "div/div/form/select/option[1]"));
    private final WebElement DIVIDE_BUTTON = DRIVER.findElement(By.xpath("/html/body/" +
            "div/div/form/select/option[2]"));
    private final WebElement MODULO_BUTTON = DRIVER.findElement(By.xpath("/html/body/" +
            "div/div/form/select/option[3]"));
    private final WebElement MULTIPLICATION_BUTTON = DRIVER.findElement(By.xpath("/html/body" +
            "/div/div/form/select/option[4]"));
    private final WebElement SUBTRACTION_BUTTON = DRIVER.findElement(By.xpath("/html/body" +
            "/div/div/form/select/option[5]"));


    /**
     * Adding two numbers
     *
     * @param firstNumber the first number
     * @param secondNumber the second number
     */
    public void addition(int firstNumber, int secondNumber) {
        String first = String.valueOf(firstNumber);
        String second = String.valueOf(secondNumber);
        NUMBER_ONE.sendKeys(first);
        NUMBER_TWO.sendKeys(second);
        ADDITION_BUTTON.click();
        GO_BUTTON.click();
    }

    /**
     * Division of two numbers
     *
     * @param firstNumber the first number
     * @param secondNumber the second number
     */
    public void divide(int firstNumber, int secondNumber) {
        String first = String.valueOf(firstNumber);
        String second = String.valueOf(secondNumber);
        NUMBER_ONE.sendKeys(first);
        NUMBER_TWO.sendKeys(second);
        DIVIDE_BUTTON.click();
        GO_BUTTON.click();
    }

    public void modulo(int firstNumber, int secondNumber) {
        String first = String.valueOf(firstNumber);
        String second = String.valueOf(secondNumber);
        NUMBER_ONE.sendKeys(first);
        NUMBER_TWO.sendKeys(second);
        MODULO_BUTTON.click();
        GO_BUTTON.click();
    }

    /**
     * multiplication two numbers
     *
     * @param firstNumber the first number
     * @param secondNumber the second number
     */
    public void multiplication(int firstNumber, int secondNumber) {
        String first = String.valueOf(firstNumber);
        String second = String.valueOf(secondNumber);
        NUMBER_ONE.sendKeys(first);
        NUMBER_TWO.sendKeys(second);
        MULTIPLICATION_BUTTON.click();
        GO_BUTTON.click();
    }

    /**
     * subtracting two numbers
     *
     * @param firstNumber the first number
     * @param secondNumber the second number
     */
    public void subtraction(int firstNumber, int secondNumber) {
        String first = String.valueOf(firstNumber);
        String second = String.valueOf(secondNumber);
        NUMBER_ONE.sendKeys(first);
        NUMBER_TWO.sendKeys(second);
        SUBTRACTION_BUTTON.click();
        GO_BUTTON.click();
    }
}
