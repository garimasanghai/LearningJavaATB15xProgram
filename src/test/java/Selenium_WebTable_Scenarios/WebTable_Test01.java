package Selenium_WebTable_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

//add 5 emp. Delete the first emp whose dept is legal

public class WebTable_Test01 {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e);
        }

        driver.findElement(By.id("addNewRecordButton")).click();
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e);
        }

        WebElement firstName1 = driver.findElement(By.id("firstName"));
        firstName1.sendKeys("Tory");
        WebElement lastName1 = driver.findElement(By.id("lastName"));
        lastName1.sendKeys("Burch");
        WebElement email1 = driver.findElement(By.id("userEmail"));
        email1.sendKeys("tory@example.com");
        WebElement age1 = driver.findElement(By.id("age"));
        age1.sendKeys("35");
        WebElement salary1 =driver.findElement(By.id("salary"));
        salary1.sendKeys("80000");
        WebElement dept1 = driver.findElement(By.id("department"));
        dept1.sendKeys("Legal");

        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("addNewRecordButton")).click();
        WebElement firstName2 = driver.findElement(By.id("firstName"));
        firstName2.sendKeys("Tory1");
        WebElement lastName2 = driver.findElement(By.id("lastName"));
        lastName2.sendKeys("Burch1");
        WebElement email2 = driver.findElement(By.id("userEmail"));
        email2.sendKeys("tory1@example.com");
        WebElement age2 = driver.findElement(By.id("age"));
        age2.sendKeys("45");
        WebElement salary2 =driver.findElement(By.id("salary"));
        salary2.sendKeys("87000");
        WebElement dept2 = driver.findElement(By.id("department"));
        dept2.sendKeys("Finance");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);

        driver.quit();


    }
}
