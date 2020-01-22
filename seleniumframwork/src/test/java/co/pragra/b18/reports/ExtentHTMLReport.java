package co.pragra.b18.reports;

import co.pragra.b18.util.FrameworkUtils;
import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentHTMLReport {
    private static ExtentReports reports;

    private ExtentHTMLReport () {
        ExtentReporter extentReporter = new ExtentHtmlReporter(FrameworkUtils.getReportFileName());
        reports = new ExtentReports();
        reports.attachReporter(extentReporter);
    }

    public static ExtentReports getReport(){
        if(reports==null){
            new ExtentHTMLReport();
        }
        return reports;
    }
}
