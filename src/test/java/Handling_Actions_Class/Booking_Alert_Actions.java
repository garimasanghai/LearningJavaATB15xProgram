package Handling_Actions_Class;

import Base_Class.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Booking_Alert_Actions extends CommonToAll {
    @Test
    public void searchFlight(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://booking.com");

      WebElement alertPopup = waitForVisibility(driver,3, By.xpath("//div[@class = 'b779265b5e']/div/button/span/span"));
      alertPopup.click();
        System.out.println(" First Test exe");

        WebElement flightbtn = waitForVisibility(driver,3, By.id("flights") );
        flightbtn.click();

       WebElement goingTb = waitForVisibility(driver, 2, By.xpath("(//span[text() = 'Going to'])[1]"));
       goingTb.click();
        System.out.println("Second Test exe");
       WebElement goingTextbox = driver.findElement(By.xpath("//input[@data-ui-name = 'input_text_autocomplete']"));
      // WebElement drpDown = waitForVisibility(driver, 1,By.xpath("(//li[@data-ui-name = 'locations_list_item'])[1]/span[3]/div"));

        Actions actions= new Actions(driver);
        actions.click(goingTextbox)     // Moves the cursor to the element
                .sendKeys("del")
                .sendKeys(Keys.TAB)     // moves the focus to the next UI element
                .sendKeys(Keys.ENTER)   // used to select a suggestion from a dropdown
                .build()
                .perform();

        waitForClickableElement(By.xpath("//button[@data-ui-name ='button_search_submit']"));

        Assert.assertEquals(driver.getTitle(), "Durgāpur – Anywhere - Booking.com");
        System.out.println("Test fully exe");

        closeBrowser(driver);
    }
}
