package Working_with_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Dependency {

    /*
    dependsOnMethods = {"openApp"}) <--- pass this as parameter
    Depending on previous method for exe.
    If previous method passes,only then  it will exe, else rest all methods will get skipped
    */

    @Test(priority = 1)
    public void openApp(){
        System.out.println("Open app");
        Assert.assertTrue(true);
    }

    @Test(priority = 2, dependsOnMethods = {"openApp"}) // depending on previous method for exe.
    public void login(){
        System.out.println("Login");
        Assert.assertTrue(true);
    }

    @Test(priority = 3, dependsOnMethods = {"login"})
    public void searchPage(){
        System.out.println("Search webpage");
        Assert.assertTrue(false);
    }


    //If 1 dependency passes, another fails, the Method exe will get skipped
    @Test(priority = 4, dependsOnMethods = {"login", "searchPage"})
    public void advanceSearchPage(){
        System.out.println("Advance search full page");
    }

    @Test(priority = 5)
    public void logout(){
        System.out.println("Log out of app");
    }
}
