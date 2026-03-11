package Handling_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebTableDemoQA {
    WebDriver driver;

    // Reusable method
    public void addUser(String firstName, String lastName, String email, String age,
                        String salary, String department) {

        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("userEmail")).sendKeys(email);
        driver.findElement(By.id("age")).sendKeys(age);
        driver.findElement(By.id("salary")).sendKeys(salary);
        driver.findElement(By.id("department")).sendKeys(department);
        driver.findElement(By.id("submit")).click();
    }

    @Test
    public void test1() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // -------- Employee 1 --------
        driver.findElement(By.id("addNewRecordButton")).click();

        addUser("Tory", "Burch","tory@example.com",
                "35", "80000", "Legal");

        Thread.sleep(2000);

        // -------- Employee 2 --------
        driver.findElement(By.id("addNewRecordButton")).click();

        addUser("Tory1", "Burch1","tory1@example.com",
                "45", "87000", "Finance");

        Thread.sleep(2000);

        // -------- Employee 3 --------
        driver.findElement(By.id("addNewRecordButton")).click();

        addUser("Tory2", "Burch2","tory2@example.com",
                "29", "90000", "IT");

        Thread.sleep(2000);

        // -------- Employee 4 --------
        driver.findElement(By.id("addNewRecordButton")).click();

        addUser("Tory3", "Burch3","tory3@example.com",
                "33", "69000", "Dev");

        Thread.sleep(2000);

        // -------- Employee 5 --------
        driver.findElement(By.id("addNewRecordButton")).click();

        addUser("Tory4", "Burch4","tory4@example.com",
                "54", "77000", "Tester");

        WebElement getEmpName = driver.findElement(By.xpath("//td[contains(text(), 'Legal')]/parent::tr/td[1]"));
        System.out.println(getEmpName.getText());

        WebElement delRecord = driver.findElement(By.id("delete-record-3"));
        delRecord.click();

        Thread.sleep(10000);
        System.out.println("Test Exe");

        driver.quit();
    }
}
