package Handling_Explicit_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Vwo_Login {
    @Test
    public void test_Login(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement usrname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa = 'hocewoqisi']")));
        usrname.sendKeys("admin@admin.com");
        WebElement passwrd= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa = 'jobodapuxe']")));
        passwrd.sendKeys("admin");
        WebElement signin= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-qa = 'sibequkica']")));
        signin.click();

        WebElement errMsg = wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-qa = 'tozemoxine']"))));
        String errorMsg = errMsg.getText();
        System.out.println("Error message: " + errorMsg);

        String expectedMsg = "Your email, password, IP address or location did not match";
        Assert.assertEquals(errorMsg,expectedMsg);
        System.out.println("Test exe");

        driver.quit();
    }
}
