package Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Vwo_Help_Project1 {

    @Test
    public void test_all(){
      WebDriver driver = new ChromeDriver();
      driver.get("https://app.vwo.com/#/login");
      driver.manage().window().maximize();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    //WebElement free_trial = driver.findElement(By.xpath("//li[@style=\"margin-bottom:8px;\"]/a[@xpath=\"1\"]"));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@class='btn Brds(1px) Bdc(--color-gray-5) Bds(s) W(100%)'])[1]"))).click();
    //free_trial.click();

    List<String> WBpage= new ArrayList<>(driver.getWindowHandles());
       driver.switchTo().window(WBpage.get(1));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"email\" and @data-qa=\"page-su-step1-v1-email\"]"))).sendKeys("bopqh2lis0@tempumail.cc");
    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='page-v1-step1-email'])[1]"))).sendKeys("ezd08@tempumail.cc");


    //div[@class="D(f) Ai(b) "]/input[@data-qa="page-free-trial-step1-gdpr-consent-checkbox"]
        driver.findElement(By.xpath("//div[@class=\"D(f) Ai(b) \"]/input[@data-qa=\"page-free-trial-step1-gdpr-consent-checkbox\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Create a Free Trial Account']"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@data-qa=\"page-su-v1-fname\"]"))).sendKeys("sganesh");
    //name

    //input[@data-qa="page-su-v1-lname"]

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@data-qa=\"page-su-v1-lname\"]"))).sendKeys("servagar");
    //lastname

    //input[@data-qa="page-su-v1-pnumber"]
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@data-qa=\"page-su-v1-pnumber\"]"))).sendKeys("9148061548");

       driver.findElement(By.xpath("(//div[@class=\"Mt(10px) Ta(c)\"]/button[@data-qa=\"page-su-submit\"])[2]")).click();
    //submit


    //skip
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-step=\"free-trial-thankyou\"]"))).click();

    //setup ypur account

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-qa=\"boxasuraza\"]"))).click();

    //vyo insite web

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@data-qa=\"cunoxonoxe\"])[2]"))).click();

    //basic details  >> add domain

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@vwo-async-click=\"vm.createProperty(vm.selectedPlatformName)\"]"))).click();

    //to copy the code

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@vwo-title=\"Copy\" and @data-qa=\"xugejexijo\"]"))).click();

}
}
