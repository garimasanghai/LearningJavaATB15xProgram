package Selenium_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeCrm_WebTable {
    @Test

    public void testTable() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);

        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        input_username.sendKeys("admin");
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        input_password.sendKeys("Hacker@4321");
        WebElement button = driver.findElement(By.xpath("//button"));
        button.click();
        Thread.sleep(2000);

        String txt = driver.findElement(By.xpath("//h6[text() = 'PIM']")).getText();
        System.out.println("Displayed text: " + txt);

        //To get the name of the emp who got terminated:

        /*WebElement name = driver.findElement(By.xpath("//div[@role='row'][.//div[text()='Terminated']]//div[@role='cell'][3]//div"));
        System.out.println(name.getText());
        */

        //div[@role= 'row'] <--- Find the row
        // [.//div[text()='Terminated']] <--- that contains Terminated
        // div[text() = 'Akshay Dilip'] <--- go up // div and then trace down to text that conatins the intended emp name

        WebElement employee = driver.findElement(By.xpath("//div[@role='row'][.//div[text()='Terminated']]"));
        driver.findElement(By.xpath("(//i[@class = 'oxd-icon bi-trash'])[3]")).click();
        Thread.sleep(4000);

        driver.quit();
    }
}
