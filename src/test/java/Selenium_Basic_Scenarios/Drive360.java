package Selenium_Basic_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Drive360 {
    @Test
    public void test_drive() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.idrive360.com/enterprise/login");
        driver.findElement(By.id("username")).sendKeys("augtest_040823@idrive.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]")).click();
        Thread.sleep(20000);

        String txt = driver.findElement(By.xpath("//div[@id = 'expiredmsg']//h5")).getText();
        Assert.assertEquals(txt, "Your free trial has expired!");
        System.out.println("Error msg successfully displayed");

        driver.quit();
    }
}
