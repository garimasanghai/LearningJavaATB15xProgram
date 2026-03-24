package Working_with_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Annotations {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Test(priority = 1)
    public void openApp(){
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.navigate().refresh();
    }

    @Test(priority = 2)
    public void verify_Logo() throws InterruptedException {
        Thread.sleep(3000);
        boolean status = driver.findElement(By.xpath("//img[@alt = 'company-branding']")).isDisplayed();
        System.out.println("logo displayed" + status);
    }

    @Test(priority = 3)
    public void login(){
        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        input_username.sendKeys("admin");
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        input_password.sendKeys("Hacker@4321");
        WebElement button = driver.findElement(By.xpath("//button"));
        button.click();
    }

    @Test(priority = 4)
    public void closeApp(){
        driver.quit();
    }
}
