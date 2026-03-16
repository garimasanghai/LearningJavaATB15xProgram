package Handling_File_Upload;

import Base_Class.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Vwo_FileUpload extends CommonToAll {

    @Test
    public void fileUpload(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com/#/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebDriverWait wait20 = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement usrname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa = 'hocewoqisi']")));
        usrname.sendKeys("garima26@tempumail.cc");
        WebElement passwrd= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa = 'jobodapuxe']")));
        passwrd.sendKeys("20G@rima$");
        WebElement signin= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-qa = 'sibequkica']")));
        signin.click();

        WebElement userMenu =
                wait20.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title = 'User menu' and @class = 'icon-button ng-scope']")));
        userMenu.click();
        WebElement settings =
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@ui-sref = 'settings.accounts.general' and contains(@ng-click, 'accountDropdownApi')]/span[text() = 'Settings']")));
        settings.click();

        WebElement profileBtn =
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Profile details')]")));
        profileBtn.click();

        WebElement uploadPic =
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type = 'file']")));
        uploadPic.sendKeys("D:\\FileUpload_Selenium\\Screenshot 2026.png");

        WebElement uploadBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Upload image')]")));
        uploadBtn.click();
        waitForJVM(200);

        closeBrowser(driver);
    }
}
