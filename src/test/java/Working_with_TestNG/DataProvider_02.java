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

public class DataProvider_02 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
    }

    //here dataProvider is n attribute of @Test
    @Test(dataProvider = "dp") // <--- pass name of dataProvider as parameter,so that it knows where data is coming from
    public void testLogin(String email, String pwd){
        WebElement emailField = driver.findElement(By.xpath("//input[@data-qa = 'hocewoqisi']"));
        emailField.clear();
        emailField.sendKeys(email);

        WebElement passwordField =driver.findElement(By.xpath("//input[@data-qa = 'jobodapuxe']"));
        passwordField.clear();
        passwordField.sendKeys(pwd);

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

    @DataProvider(name = "dp")    // <--- DP mostly returns two-dimensional Object type array
    public Object[][] loginData(){
        Object data [][] = {
                {"admin@admin.com", "admin123"},          // valid
                {"user1@admin.com", "pass123"},           // invalid
                {"cdef1@admin.com", "password"},          // invalid
                {"useradmin@admin.com", "username"},     // invalid
                {"invalid@admin.com", "invalid123"}      // invalid
        };
        return data;
    }
}