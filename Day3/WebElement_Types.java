package krishna;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Krishna {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();

        driver.get("https://maya.adityauniversity.in/");
//        Thread.sleep(3000);

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[.='Login']")).click();
        JavascriptExecutor Radha=(JavascriptExecutor) driver;
        Radha.executeScript("window.scrollBy(0,200)");
        Thread.sleep(2000);
        WebElement Name=driver.findElement(By.name("roll_no"));
        Name.sendKeys("23A91A05D0");
        /*driver.findElement(By.name("roll_no")).sendKeys("23A91A05D0");*/
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Bhargavi@05");
        Thread.sleep(3000);

        driver.quit();
    }
}
