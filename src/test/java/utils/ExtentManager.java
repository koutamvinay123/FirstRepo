package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports exp;
    public static ExtentReports sync(){
        ExtentSparkReporter esp = new ExtentSparkReporter("extent-report.html");
        exp = new ExtentReports();
        exp.attachReporter(esp);
        return exp;
    }
}
