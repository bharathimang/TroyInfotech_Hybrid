package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import tests.Base;

public class ReportUtils extends Base {
	
	public ReportUtils() {
		ExtentHtmlReporter htmlReport=new ExtentHtmlReporter("target//report.html");
		report=new ExtentReports();
		report.attachReporter(htmlReport);
		test=report.createTest("Test1");
	}

}
