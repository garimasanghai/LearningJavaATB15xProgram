package Selenium_Basic_Scenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Google_Test_Page extends Google_Base_Page{

    @Test
    public void browserOpen() throws InterruptedException {
        System.out.println("Test started");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        System.out.println("Actual Title: " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Google Page Opened");

        Thread.sleep(2000);
    }
}
