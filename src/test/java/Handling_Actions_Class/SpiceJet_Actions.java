package Handling_Actions_Class;

import Base_Class.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SpiceJet_Actions extends CommonToAll {
    @Test
    public void testAlert(){
        driver = new ChromeDriver();
        openBrowser(driver,"https://www.spicejet.com/");

        WebElement fromDest = driver.findElement(By.xpath("//div[text() = 'From']/following::div[1]/input"));
        WebElement toDest = driver.findElement(By.xpath("//div[text() = 'To']/following::div[1]/input"));

        //  fromDest.sendKeys("del");
        // toDest.sendKeys("blr");

        Actions actions = new Actions(driver);
        actions.moveToElement(fromDest).click().sendKeys("del")
                .moveToElement(toDest).click().sendKeys("blr")
                .build().perform();

        waitForJVM(3000);

        System.out.println("Test exe");
        closeBrowser(driver);
    }
}
