package Working_with_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_via_Xml {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    @Parameters({"browser"})
    void setup(String br){      // <--- the value of the browser from testNG_param.xml will get populated here & exe
       switch(br){
           case"chrome": driver = new ChromeDriver(); break;
           case"edge": driver = new EdgeDriver(); break;
           case"firefox": driver = new FirefoxDriver(); break;
           default:
               System.out.println("Enter valid browser name");
               return;
        }

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
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
