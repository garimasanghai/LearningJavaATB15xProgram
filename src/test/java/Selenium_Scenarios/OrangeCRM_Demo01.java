package Selenium_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeCRM_Demo01 {
    @Test
    public void test_OHRM_login() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        input_username.sendKeys("admin");
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        input_password.sendKeys("Hacker@4321");
        WebElement button = driver.findElement(By.xpath("//button"));
//        WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        button.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Assertion
        WebElement h6 = driver.findElement(By.xpath("//h6[text() = 'PIM']"));
        Assert.assertEquals(h6.getText(), "PIM");

        driver.quit();
    }
}
