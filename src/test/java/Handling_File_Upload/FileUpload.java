package Handling_File_Upload;

import Base_Class.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload extends CommonToAll {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));
        String user_dir_path = System.getProperty("user.dir");
        System.out.println(user_dir_path);
     //   uploadFileInput.sendKeys(user_dir_path + "/src/test/java/com/thetestingacademy/ex_011_File_Upload/data.json");
        uploadFileInput.sendKeys(user_dir_path + "/src/test/java/File_Upload/data.json");
        driver.findElement(By.name("submit")).click();

    }
}
