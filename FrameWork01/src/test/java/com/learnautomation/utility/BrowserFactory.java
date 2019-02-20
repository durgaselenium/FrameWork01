package com.learnautomation.utility;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

 public static WebDriver startApplication(WebDriver driver,String browserName,String appURL)
 {
if (browserName.equalsIgnoreCase("chrome"))
{
File file = new File("./Drivers/chromedriver.exe");
System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
driver = new ChromeDriver();
}

else if (browserName.equalsIgnoreCase("firefox"))
{
File file = new File("./Drivers/geckodriver.exe");
System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
driver = new FirefoxDriver();
}	 

else if (browserName.equalsIgnoreCase("IE"))
{
File file = new File("./Drivers/IEDriverServer.exe");
System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
driver = new InternetExplorerDriver();
}	 

else
{
System.out.println("Browser is not supported");	
}
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get(appURL);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
return driver;
 }
	
public static void quitBrowser(WebDriver driver)
{
driver.quit();	
}
	
}	

