package Working_with_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest_viaPF {
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
        LoginPage_viaPF pf = new LoginPage_viaPF(driver);
        pf.usrname("admin");
        pf.password("Hacker@4321");
        pf.clickBtn();

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        System.out.println("Test via page factory exe");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
