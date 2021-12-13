package webCalc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCalc {

    public void setUp(int firstNumber, int secondNumber) {
        System.setProperty("webdriver.chrome.driver", "D://ChromeDriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://juliemr.github.io/protractor-demo/");
        WebElement op1 = driver.findElement(By.xpath("/html/body/div/div/form/input[1]"));
        WebElement op2 = driver.findElement(By.xpath("/html/body/div/div/form/input[2]"));
        op1.sendKeys("10.2");
        op2.sendKeys("5");
        WebElement goButton = driver.findElement(By.xpath("/html/body/div/div/form/button"));
        WebElement additionButton = driver.findElement(By.xpath("/html/body/div/div/form/select/option[1]"));
        WebElement divideButton = driver.findElement(By.xpath("/html/body/div/div/form/select/option[2]"));
        WebElement moduloButton = driver.findElement(By.xpath("/html/body/div/div/form/select/option[3]"));
        WebElement multiplicationButton = driver.findElement(By.xpath("/html/body/div/div/form/select/option[4]"));
        WebElement subtractionButton = driver.findElement(By.xpath("/html/body/div/div/form/select/option[5]"));
        inputTwoNumbers(firstNumber, secondNumber);
    }

    public void inputTwoNumbers(int firstNumber, int secondNumber) {
        String first = String.valueOf(firstNumber);
        String second = String.valueOf(firstNumber);

    }
}
