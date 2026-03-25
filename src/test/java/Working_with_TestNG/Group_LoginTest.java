package Working_with_TestNG;

import org.testng.annotations.Test;

public class Group_LoginTest {

    @Test(priority = 1, groups = {"sanity"})
    public void loginByEmail(){
        System.out.println("Login by email");
    }

    @Test(priority = 2, groups = {"sanity"})
    public void loginByOutlook(){
        System.out.println("Login by Outlook");
    }

    @Test(priority = 3, groups = {"sanity"})
    public void loginByTwitter(){
        System.out.println("Login by Twitter");
    }
}
