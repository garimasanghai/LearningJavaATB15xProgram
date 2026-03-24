package Working_with_TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_SoftAssert {
    SoftAssert sa;
    @Test
    public void test_softassert(){
        sa = new SoftAssert();
        System.out.println("Testing");
        sa.assertEquals(123, 123);
        System.out.println("Still testing");
        sa.assertAll();
    }
}

/*
SoftAssert sa = new SoftAssert();
        System.out.println("Testing");
        sa.assertEquals(123, "123");
        System.out.println("Still testing");
        sa.assertAll();
*/
