package Working_with_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    @Parameters({"browser"})
    void setup(String br){      // <--- the value of the browser from testNG_param.xml will get populated here & exe
        driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    void testLogo(){
       boolean logo = driver.findElement(By.xpath("//img[@alt = 'company-branding']")).isDisplayed();
        Assert.assertEquals(logo, true);
    }

    @Test(priority = 2)
    void testTitle(){
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @Test(priority = 3)
    void testUrl(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/hr/web/index.php/auth/login");
        System.out.println("ParameterTest exe");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}