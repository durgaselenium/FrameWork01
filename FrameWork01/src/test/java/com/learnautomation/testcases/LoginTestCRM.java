package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.Helper;

public class LoginTestCRM extends BaseClass{

@Test	
public void loginPage()
{


logger = report.createTest("Login to CRM");	
LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
logger.info("Starting Application"); 

//loginpage.loginToCRM("deviselenium663@gmail.com", "sample@123");
loginpage.loginToCRM(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
logger.pass("Login Success");


Helper.captureScreenshot(driver);
}
	
}
