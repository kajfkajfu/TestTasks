package webCalc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebCalc {
    private final CustomWebDriver webDriver = new CustomWebDriver();
    private final WebDriver driver = webDriver.getDriver();
    private final WebElement NUMBER_ONE = driver.findElement(By.xpath("/html/body/div/div/form/input[1]"));
    private final WebElement NUMBER_TWO = driver.findElement(By.xpath("/html/body/div/div/form/input[2]"));
    private final WebElement GO_BUTTON = driver.findElement(By.xpath("/html/body/div/div/form/button"));
    private final WebElement ADDITION_BUTTON = driver.findElement(By.xpath("/html/body/" +
            "div/div/form/select/option[1]"));
    private final WebElement DIVIDE_BUTTON = driver.findElement(By.xpath("/html/body/" +
            "div/div/form/select/option[2]"));
    private final WebElement MODULO_BUTTON = driver.findElement(By.xpath("/html/body/" +
            "div/div/form/select/option[3]"));
    private final WebElement MULTIPLICATION_BUTTON = driver.findElement(By.xpath("/html/body" +
            "/div/div/form/select/option[4]"));
    private final WebElement SUBTRACTION_BUTTON = driver.findElement(By.xpath("/html/body" +
            "/div/div/form/select/option[5]"));


    public void addition(int firstNumber, int secondNumber) {
        String first = String.valueOf(firstNumber);
        String second = String.valueOf(secondNumber);
        NUMBER_ONE.sendKeys(first);
        NUMBER_TWO.sendKeys(second);
        ADDITION_BUTTON.click();
        GO_BUTTON.click();
    }


}
