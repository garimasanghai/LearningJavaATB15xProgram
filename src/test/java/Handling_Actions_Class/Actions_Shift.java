package Handling_Actions_Class;

import Base_Class.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Actions_Shift extends CommonToAll {
    @Test
    public void check_Shift(){
        driver = new ChromeDriver();
        openBrowser(driver,"https://www.facebook.com/");

        WebElement emailBox = waitForVisibility(driver, 5, By.name("email"));

        Actions actions = new Actions(driver);
        actions.click(emailBox)              // focus
                .keyDown(Keys.SHIFT)
                .sendKeys("ADMIN")
                .keyUp(Keys.SHIFT)
                .perform();

        waitForJVM(3000);
        System.out.println("Test Exe");
        closeBrowser(driver);

    }
}
