package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

//Screenshot,alerts,Frames,windows,sync issues,Javascript executor
public static  String captureScreenshot(WebDriver driver)
{
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String screenshotpath=System.getProperty("user.dir")+"./Screenshots/FreeCRM_"+getCurrentDateTime()+".png";
//loction
try {
	org.openqa.selenium.io.FileHandler.copy(src, new File(screenshotpath));
	System.out.println("Screenshot Captured");
} 
catch (IOException e) 
{
System.out.println("Unable to Capture Screenshots"+e.getMessage());	
}
return screenshotpath;

}
public static String getCurrentDateTime()
{
DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
Date currentDate = new Date();
return customFormat.format(currentDate);


}
	
}
