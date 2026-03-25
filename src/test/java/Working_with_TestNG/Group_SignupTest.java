package Working_with_TestNG;

import org.testng.annotations.Test;

public class Group_SignupTest {

    @Test(priority = 1, groups = {"regression"})
    public void signupByEmail(){
        System.out.println("Sign-up by Email");
    }

    @Test(priority = 2, groups = {"regression"})
    public void signupByOutlook(){
        System.out.println("Sign-up by Outlook");
    }

    @Test(priority = 3, groups = {"regression"})
    public void signupByTwitter(){
        System.out.println("Sign-up by Twitter");
    }
}
