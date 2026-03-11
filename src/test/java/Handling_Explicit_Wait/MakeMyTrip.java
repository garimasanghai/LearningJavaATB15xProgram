package Handling_Explicit_Wait;

import Base_Class.CommonToAll;
import Base_Class.WaitHelpers;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMyTrip extends CommonToAll {

    @Description("Verify  makemytrip opens with modal")
    @Test
    public void testCloseModal() {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.makemytrip.com/");
        waitForVisibility(driver,3,By.xpath("//span[@data-cy='closeModal']"));
        waitForClickableElement(By.xpath("//span[@data-cy='closeModal']"));

        // static -
        WaitHelpers.waitJVM(10000);
        closeBrowser(driver);
    }

}
