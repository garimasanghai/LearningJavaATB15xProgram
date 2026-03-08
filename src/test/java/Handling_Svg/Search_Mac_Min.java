package Handling_Svg;

import Base_Class.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Search_Mac_Min extends CommonToAll {

    ChromeDriver driver;

    @Test
    public void test_Mac_MinPrice() {

        driver = new ChromeDriver();
        openBrowser(driver, "https://www.flipkart.com/search?q=Mac%20Mini&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

        List<WebElement> priceList = driver.findElements(By.xpath("//div[@class = 'hZ3P6w']"));

        //Now convert the price to Integer to find the min value
        int minPrice = Integer.MAX_VALUE;
        for(WebElement price : priceList){
            String fullList = price.getText();
          //  System.out.println(fullList);
            fullList = fullList.replace("₹","").replace(",","");

            int value = Integer.parseInt(fullList);
            if(value < minPrice){
                minPrice = value;
            }
        }
        System.out.println("Min Price: ₹" + minPrice);
        closeBrowser(driver);
    }
}
