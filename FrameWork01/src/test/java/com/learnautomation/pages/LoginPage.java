package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
 WebDriver driver;
//constructor
public LoginPage(WebDriver ldriver)
{
this.driver=ldriver;	
}
@FindBy(xpath="//span[contains(text(),'Log In')]")WebElement loginButtin;	
@FindBy(name="email")WebElement uname;
@FindBy(name="password")WebElement pass;
@FindBy(xpath="//div[text()='Login']")WebElement submitButton;
	

public void loginToCRM(String usernameapplication, String passwordapplication)
{
 try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	
}	
	
loginButtin.click();
uname.sendKeys(usernameapplication);
pass.sendKeys(passwordapplication);
submitButton.click();
}
}