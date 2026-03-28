package Working_with_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    //Constructor
    LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Locators
    By input_usrname = By.xpath("//input[@name='username']");
    By input_pwd = By.xpath("//input[@placeholder='Password']");
    By signIn_button = By.xpath("//button");

    //Action Methods
    public void usrname(String user){
        driver.findElement(input_usrname).sendKeys(user);
    }
    public void password(String pwd){
        driver.findElement(input_pwd).sendKeys(pwd);
    }
    public void clickBtn(){
        driver.findElement(signIn_button).click();
    }
}