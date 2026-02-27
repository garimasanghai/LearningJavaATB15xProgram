package Selenium_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Bank_Digital {
    @Test
    public void test_Bank_Digital() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[contains(text(), \"Sign Up\")]")).click();
        driver.findElement(By.xpath("//input[@type =\"text\"]")).sendKeys("John Doe");
        driver.findElement(By.xpath("//input[@type =\"email\"]")).sendKeys("abc@example.com");
        driver.findElement(By.xpath("//input[@type =\"password\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//button[contains(text(), \"Create Account\")]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='Transfer Funds']")).click();
        driver.findElement(By.xpath("//input[@type ='number' and @placeholder = '0.00']")).sendKeys("5000");
        driver.findElement(By.xpath("//button[contains(text(), 'Continue')]")).click();

        driver.findElement(By.xpath("//button[contains(text(), 'Confirm Transfer')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[contains(text(), 'Dashboard')]")).click();
        String balanceText = driver.findElement(By.xpath("//h3[contains(text(),'$')]")).getText();
        // driver.findElement(By.xpath("//p[text() = 'Total Balance']/../h3")).getText();
        Assert.assertEquals(balanceText, "$45,000.00");
        System.out.println("Test exe");

        driver.quit();
    }
}
