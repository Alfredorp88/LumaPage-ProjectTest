package Base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class CustomListener extends BasePage implements ITestListener {
    public CustomListener() throws IOException {
    }

    public synchronized void onStart(ITestContext context){
        ExtentManager.getReport();
        ExtentManager.createTest(context.getName(), context.getName());
    }

    @Override
    public synchronized void onTestFailure(ITestResult result){
        ExtentManager.getTest().fail(result.getThrowable());
        try{
            System.out.println("Test Failed: " + result.getName());
            takeSnapShot(result.getMethod().getMethodName());
            ExtentManager.attachImage();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public synchronized void onFinish(ITestContext context){
        ExtentManager.flushReport();
    }
}
