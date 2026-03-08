package Handling_Svg;

import Base_Class.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Svg_Flipkart extends CommonToAll {

    @Test
    public void indentify_svgTitle(){
        driver= new ChromeDriver();
        openBrowser(driver, "https://www.flipkart.com/search");

        WebElement search_input = driver.findElement(By.name("q"));
        search_input.sendKeys("macmini");

        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name() = 'svg']"));
        svgElements.get(0).click();

       // waitForVisibility(driver, 5,By.xpath("//div[contains(@data-id, 'CPU') or contains(@data-id, \"MPC\")]/div/a[2]"));
       waitForVisibility(driver, 5,By.xpath("//div[contains(@data-id, 'CPU')]/div/a[2]"));
       List<WebElement> svgTitles = driver.findElements(By.xpath("//div[contains(@data-id, 'CPU') or contains(@data-id, \"MPC\")]/div/a[2]"));
       for( WebElement title : svgTitles){
           System.out.println(title.getText());
       }

        waitForJVM(2000);
        closeBrowser(driver);
    }
}
