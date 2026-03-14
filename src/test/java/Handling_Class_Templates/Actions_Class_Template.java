package Handling_Class_Templates;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Actions_Class_Template {
    public static void main(String[] args) {

       /* Create Actions Object
               ↓
         Add interactions (move, click, drag, key press)
               ↓
        Build sequence
               ↓
        Perform execution */

        WebDriver driver;
        WebDriverWait wait;

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("");
        driver.manage().window().maximize();

        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
        WebElement ele2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform(); // <----- Mouse hover
        actions.contextClick().perform(); // <---- Right click
        actions.doubleClick().perform(); // <----- double click
        actions.dragAndDrop(ele, ele2).perform(); // <---- drag n drop

        /*
        actions
        .click(goingTextbox)   Moves the cursor to the element goingTextbox and performs a mouse click on it.
        .sendKeys("del")	   Types the text "del" into the currently focused element (the textbox).
        .sendKeys(Keys.TAB)    Simulates pressing the TAB key, which moves the focus to the next UI element (commonly used to trigger autocomplete suggestions or move between fields).
        .sendKeys(Keys.ENTER)  Simulates pressing the ENTER key, usually used to select a suggestion from a dropdown or confirm the input.
        */

        WebElement goingTextbox = driver.findElement(By.xpath("//input[.vhjg jb]"));
        actions.click(goingTextbox)     // Moves the cursor to the element
                .sendKeys("del")
                .sendKeys(Keys.TAB)    // moves the focus to the next UI element
                .sendKeys(Keys.ENTER) // used to select a suggestion from a dropdown
                .build()
                .perform();
    }
}
