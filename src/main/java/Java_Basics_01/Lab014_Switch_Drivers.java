package Java_Basics_01;

import java.util.Scanner;

public class Lab014_Switch_Drivers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Browser: ");
        String browser = sc.next();

      /*
       == → compares objects
      .equals() → compares values
       */

        if(browser.equals("chrome") || browser.equals("firefox") || browser.equals("edge")) {

        switch(browser) {
            case "chrome":
                System.out.println("Initializing Chrome Browser");
                System.out.println("WebDriver driver = new ChromeDriver()");
                break;
            case "firefox":
                System.out.println("Initializing Firefox Browser");
                System.out.println("WebDriver driver = new FirefoxDriver()");
                break;
            case "edge":
                System.out.println("Initializing Edge Browser");
                System.out.println("WebDriver driver = new EdgeDriver()");
        }
        }
        else{
            System.out.println("This is not supported");
        }
    }
}
