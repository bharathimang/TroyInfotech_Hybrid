package tests;

import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.ConfigUtility;
import utils.ExcelUtils;
import utils.ReportUtils;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	public static ConfigUtility config;
	public static ExcelUtils excel;
	public static ArrayList<String> data;
	public static ExtentTest test;
	public static ExtentReports report;
	public static String ssfileName;
	
	@BeforeTest
	public void setup() throws Throwable {
		ReportUtils reportObj=new ReportUtils();
		config=new ConfigUtility();
	    excel=new ExcelUtils();
		System.setProperty("webdriver.chrome.driver", config.getDriverPath());
		driver=new ChromeDriver();		
		driver.get(config.getURL());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown() {
		report.flush();
		driver.close();
	}

}
