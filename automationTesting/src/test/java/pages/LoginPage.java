package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Wrapper.GenericWrapper;
import tests.Base;

public class LoginPage extends Base {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='txtUsername']")
	public static WebElement uName;

	@FindBy(xpath = "//input[@id='txtPassword']")
	public static WebElement pwd;

	@FindBy(xpath = "//input[@id='btnLogin']")
	public static WebElement btn;

	public void doValidation() throws IOException {
		try {
			System.out.println(uName.isDisplayed());
			System.out.println(pwd.isDisplayed());
			System.out.println(btn.isDisplayed());
			test.log(Status.PASS, "Elements Validations");
		}

		catch (Exception e) {
			test.log(Status.FAIL, "Elements Validations");
		}

		finally {
			GenericWrapper.createScreenCapture();
			test.addScreenCaptureFromPath("C:\\Users\\bhara\\eclipse-workspace\\automationTesting\\target\\Screenshots\\"+ssfileName+".png");
		}

	}

	public void doLogin() throws IOException {

		System.out.println(excel.getRowDatas(2).get(0));
		System.out.println(excel.getRowDatas(2).get(1));
		System.out.println(excel.getRowDatas(2).get(2));
		try {
			uName.sendKeys(config.getUserName());
			pwd.sendKeys(config.getPassword());
			btn.click();
			test.log(Status.PASS, "Login is success");
		} catch (Exception e) {
			test.log(Status.FAIL, "Login is not success");
		} finally {
			GenericWrapper.createScreenCapture();
			test.addScreenCaptureFromPath("C:\\Users\\bhara\\eclipse-workspace\\automationTesting\\target\\Screenshots\\"+ssfileName+".png");
		}
	}

}
