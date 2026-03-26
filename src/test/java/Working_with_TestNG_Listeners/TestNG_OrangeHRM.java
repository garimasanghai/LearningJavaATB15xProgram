package Working_with_TestNG_Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_OrangeHRM {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    void testLogo() {
        boolean logo = driver.findElement(By.xpath("//img[@alt = 'company-branding']")).isDisplayed();
        Assert.assertEquals(logo, true);
    }

    @Test(priority = 2)
    void testUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 3, dependsOnMethods = {"testUrl"})
    void testTitle() {
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
      System.out.println("TestNG OrangeHRM exe");
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }
}