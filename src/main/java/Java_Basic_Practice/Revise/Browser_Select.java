package Java_Basic_Practice.Revise;

import java.util.Scanner;

public class Browser_Select {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter browser: ");
        String browser = sc.next().toLowerCase();

        if(browser.equals("chrome") || browser.equals("firefox") || browser.equals("edge")){
            switch (browser){
                case "chrome" :
                    System.out.println("Initializing Chrome Browser ...");
                    System.out.println(" WebDriver driver = new ChromeDriver();");
                    break;
                case "firefox" :
                    System.out.println("Initializing Firefox Browser ...");
                    System.out.println("WebDriver driver = new FirefoxDriver();");
                    break;
                case "edge" :
                    System.out.println("Initializing Edge Browser ...");
                    System.out.println("WebDriver driver = new EdgeDriver();");
                    break;
            }
        }
        else{
            System.out.println("Browser not supported");
        }
    }
}
