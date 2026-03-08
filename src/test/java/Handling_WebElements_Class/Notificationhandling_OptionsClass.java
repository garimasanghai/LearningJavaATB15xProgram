package Handling_WebElements_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class Notificationhandling_OptionsClass {
    {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(co);


        FirefoxOptions fo =  new FirefoxOptions();
        fo.addArguments("--disable-notifications");
        WebDriver driver1 = new FirefoxDriver(fo);

        driver.get("");
        driver.manage().window().maximize();

    }
}
