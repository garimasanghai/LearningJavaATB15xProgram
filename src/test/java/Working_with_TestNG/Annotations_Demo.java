package Working_with_TestNG;

import org.testng.annotations.*;

public class Annotations_Demo {

    @BeforeSuite
    public void bf_Suite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void af_Suite(){
        System.out.println("After Suite");
    }

    @BeforeTest
    public void bf_Test(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void af_Test(){
        System.out.println("After Test");
    }

    @BeforeClass
    public void webpage(){
        System.out.println("Before Class");
    }

    @BeforeMethod  // Before every METHOD it will exe
    public void login(){
        System.out.println("Before Method ---> " + "LogIn");
    }

    @AfterMethod    // After every METHOD it will exe
    public void logout(){
        System.out.println("After Method ---> " + "LogOut \n");
    }

    @Test(priority = 1)
    public void search(){
        System.out.println("Test Method ---> " + "(priority = 1)");
    }

    @Test(priority = 2)
    public void adv_Search(){
        System.out.println("Test Method ---> " + "(priority = 2)");
    }

    @AfterClass
    public void closing_webpage(){
        System.out.println("After Class");
    }
}