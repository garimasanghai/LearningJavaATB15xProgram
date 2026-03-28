package Working_with_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    void setUp(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
    void login(){
        LoginPage lp = new LoginPage(driver);
        lp.usrname("admin");
        lp.password("Hacker@4321");
        lp.clickBtn();

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        System.out.println("Test exe");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
