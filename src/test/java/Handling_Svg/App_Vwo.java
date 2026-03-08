package Handling_Svg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class App_Vwo {
    @Test
    public void test_svg(){

        WebDriver driver;
        WebDriverWait wait;

        driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

       WebElement svg_img = driver.findElement(By.xpath("(//span[@class ='checkbox-radio-button ng-scope'])[1]//*[name() ='svg']"));
        System.out.println("The element was present");

        driver.quit();

    }
}
