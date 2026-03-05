package Selenium_WebTable_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeCrm_WT_02 {
    @Test
    public void test_wt1() throws InterruptedException {
        WebDriver driver; // declaring it global

        driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        input_username.sendKeys("admin");
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        input_password.sendKeys("Hacker@4321");
        WebElement button = driver.findElement(By.xpath("//button"));
        button.click();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }

        String txt = driver.findElement(By.xpath("//h6[text() = 'PIM']")).getText();
        System.out.println("Displayed text: " + txt);

        WebElement txt2 = driver.findElement(By.xpath("//div[text() = 'Working']/ancestor::div[@role='row']//div[4]"));
        System.out.println("The emp is: " + txt2.getText());

        driver.quit();
    }
}
