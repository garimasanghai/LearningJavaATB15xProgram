package Working_with_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProvider_01 {

    WebDriver driver;
    WebDriverWait wait;
    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testLogin(){
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@data-qa = 'hocewoqisi']")).sendKeys("admin@admin.com");
        driver.findElement(By.xpath("//input[@data-qa = 'jobodapuxe']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@data-qa = 'sibequkica']")).click();

        WebElement errMsg= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-qa = 'rixawilomi']")));
        String errorMessage= errMsg.getText();
        String actualMsg= "Your email, password, IP address or location did not match";

        Assert.assertEquals(errorMessage, actualMsg );
        System.out.println("Test exe");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @DataProvider(name = "dp")    // <--- DP mostly returns two-dimensional Object type of an array
    public Object[][] loginData(){
        Object data [][] = {
                {"admin", "admin123"},          // valid
                {"user1", "pass123"},           // invalid
                {"", "password"},               // empty username
                {"admin", ""},                  // empty password
                {"invalidUser", "invalidPass"}  // completely wrong
        };
        return data;
    }
}
