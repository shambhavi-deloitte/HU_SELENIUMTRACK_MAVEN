import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends Testcases implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }
    @Override
    public void onTestSuccess(ITestResult result)
    {
        try {
            Screenshot.getPositiveScreenShot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onTestFailure(ITestResult result){
        try {
            Screenshot.getNegativeScreenShot();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }
}