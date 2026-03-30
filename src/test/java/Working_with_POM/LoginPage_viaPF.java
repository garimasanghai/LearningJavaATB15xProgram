package Working_with_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage_viaPF {
    WebDriver driver;

    // creating construtor
    LoginPage_viaPF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);  // <--- MANDATORY
    }

    @FindBy(xpath = "//input[@name='username']")
    WebElement input_usrname;

    @FindBy(xpath ="//input[@placeholder='Password']")
    WebElement input_pwd;

    @FindBy(xpath = "//button")
    WebElement signIn_button;

    @FindBy(tagName = "a")
    List<WebElement> links;

    public void usrname(String user){
        input_usrname.sendKeys(user);
    }
    public void password(String pwd){
        input_pwd.sendKeys(pwd);
    }
    public void clickBtn(){
        signIn_button.click();
    }
}
