
package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Day4Selectors {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");

        // 1. CSS SIMPLE SELECTORS

        // Tag selector
        WebElement tag = driver.findElement(
                By.cssSelector("input"));

        // Class selector
        WebElement cls = driver.findElement(
                By.cssSelector(".radius"));

        // ID selector
        WebElement id = driver.findElement(
                By.cssSelector("#username"));

        // 2. CSS ATTRIBUTE SELECTORS

        // Attribute exists
        WebElement exists = driver.findElement(
                By.cssSelector("input[type]"));

        // Attribute value
        WebElement value = driver.findElement(
                By.cssSelector("input[type='text']"));

        // Attribute starts with
        WebElement starts = driver.findElement(
                By.cssSelector("input[id^='user']"));

        // Attribute ends with
        WebElement ends = driver.findElement(
                By.cssSelector("input[id$='name']"));

        // 3. XPATH - ABSOLUTE
        WebElement absolute = driver.findElement(
                By.xpath("/html/body/div[2]/div/div/form/div[1]/div/input"));

        // 4. XPATH - RELATIVE

        // Using tag
        WebElement relative = driver.findElement(
                By.xpath("//input"));

        // Using ID
        WebElement xpathId = driver.findElement(
                By.xpath("//input[@id='username']"));

        // Using class
        WebElement xpathClass = driver.findElement(
                By.xpath("//button[@class='radius']"));

        // Using attribute
        WebElement xpathAttribute = driver.findElement(
                By.xpath("//input[@type='text']"));

        // Perform actions
        driver.findElement(By.id("username"))
                .sendKeys("tomsmith");

        driver.findElement(By.id("password"))
                .sendKeys("SuperSecretPassword!");

        driver.findElement(By.cssSelector(".radius"))
                .click();

        System.out.println("CSS Selectors and XPath executed");

        driver.quit();
    }
}
