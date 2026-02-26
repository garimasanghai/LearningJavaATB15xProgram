package Selenium_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestLeaf {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.leafground.com/input.xhtml");
        WebElement nameTxt = driver.findElement(By.id("j_idt88:name"));
        nameTxt.sendKeys("ABC");
        WebElement errorField= driver.findElement(By.id("j_idt106:thisform:age"));
        errorField.sendKeys("Error message displayed");

        WebElement tellAbturslf = driver.findElement(By.id("j_idt88:j_idt101"));
        tellAbturslf.sendKeys("Hi, how r u?");
        Thread.sleep(5000);

        driver.quit();
    }
}
