package Working_with_TestNG_Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_Listeners implements ITestListener {
    // while implementing change the access modifier frm default to PUBLIC

    public void onStart(ITestContext context) {  // <--- will exe only once b4 starting all the Test
        System.out.println("Test exe started ---");
    }

    public void onTestStart(ITestResult result) {  // <--- will get triggered automatically b4 start of any Test
        System.out.println("Test will start b4 the start of any method ---");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Will exe if test method gets PASSED ---");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Will exe if test method gets FAILED ---");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Will exe if test method gets SKIPPED ---");
    }

    public void onFinish(ITestContext context) {
        System.out.println("When all tests are FINISHED ---");
    }
}
