import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Testlistener extends TestListenerAdapter {
    public void onTestStart(ITestResult tr) {
        System.out.println("test started");
        System.out.println("test's name is " + tr.getName());
    }

    public void  onTestFailure(ITestResult tr) {
        System.out.println("test failed");
        System.out.println( "test's name is " + tr.getName());

    }
}