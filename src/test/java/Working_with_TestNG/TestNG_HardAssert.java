package Working_with_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_HardAssert {

    @Test
    public void test_01(){
      /*  String a = "123";
        int b= 123;

        Assert.assertEquals(a, b); // <------ FAILED
        System.out.println("Passed");*/

       /* Assert.assertEquals(123,"123");  // <------ FAILED
        System.out.println("Fail");*/

        /*Assert.assertNotEquals(123, "123");  // <------ PASSED

        Assert.assertTrue(true);  // <------ PASSED
        Assert.assertFalse(false);  // <------ PASSED
        Assert.assertTrue(false);  // <------ FAILED
        Assert.assertFalse(true);  // <------ FAILED*/

        Assert.assertTrue(1==2);
        Assert.assertFalse(1==2);

       // Assert.fail();
    }


}
