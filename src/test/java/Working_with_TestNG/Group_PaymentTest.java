package Working_with_TestNG;

import org.testng.annotations.Test;

public class Group_PaymentTest {

    @Test(priority = 1, groups = {"sanity", "regression", "functional"})
    public void paymentInRupees(){
        System.out.println("Payment in Rupees");
    }

    @Test(priority = 2, groups = {"sanity", "regression", "functional"})
    public void paymentInDollars(){
        System.out.println("Payment in Dollars");
    }
}
