package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager extends BasePage{
    public static ExtentReports extentReport;
    public static String extentReportPrefix;
    public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    public ExtentManager() throws IOException {
    }

    public static void getReport(){
        if (extentReport == null){
            setupExtentReport("Live Project 1");
        }
    }

    public static void setupExtentReport(String testName){
        extentReport = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/report/" + extentReportsPrefix_Name(testName) + ".html");
        extentReport.attachReporter(spark);

        extentReport.setSystemInfo("Tester", "Alfredo Rodriguez");
        spark.config().setReportName("Regression Test");
        spark.config().setDocumentTitle("Test Result");
        spark.config().setTheme(Theme.DARK);

    }

    public static String extentReportsPrefix_Name (String testName) {
        String date = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        extentReportPrefix = testName + "_" + date;
        return extentReportPrefix;
    }

    public static void flushReport(){
        extentReport.flush();
    }

    public synchronized static ExtentTest getTest(){
        return extentTest.get();
    }

    public synchronized static void createTest(String name, String description){
        ExtentTest test = extentReport.createTest(name, description);
        extentTest.set(test);
        getTest();
    }

    public synchronized static void log(String message){
        getTest().info(message);
    }

    public synchronized static void pass(String message){
        getTest().pass(message);
    }

    public synchronized static void fail(String message){
        getTest().fail(message);
    }

    public synchronized static void attachImage(){
        getTest().addScreenCaptureFromPath(getScreenShotDestinationPath());
    }

}



