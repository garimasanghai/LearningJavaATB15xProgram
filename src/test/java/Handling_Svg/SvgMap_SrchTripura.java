package Handling_Svg;

import Base_Class.CommonToAll;
import Base_Class.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SvgMap_SrchTripura extends CommonToAll {

    @Test
    public void srch_Tripura(){
        ChromeDriver driver = new ChromeDriver();
        String URL = "https://www.amcharts.com/svg-maps/?map=india";
        driver.get(URL);
        driver.manage().window().maximize();

       /* WaitHelpers waitHelpers = new WaitHelpers();
        waitHelpers.waitJVM(3000);

       WebElement tripuraEle = driver.findElement(By.xpath("//*[name() ='svg']//*[contains(@aria-label, 'Tripura')]"));
        waitHelpers.waitJVM(3000);

        //To switchTo iframe:
         wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName("iframe")));
        */


       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


        WebElement tripuraEle = wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//*[name()='svg']//*[contains(@aria-label,'Tripura')]")));
        tripuraEle.click();
        System.out.println("Element Clicked");
*/
        closeBrowser(driver);
    }

}
