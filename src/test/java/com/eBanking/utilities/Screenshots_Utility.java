package com.eBanking.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.eBanking.testcases.BaseClass;

public class Screenshots_Utility extends BaseClass{
	
	public static void Screenshot(WebDriver driver,String testCaseName ) throws Exception {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		FileUtils.copyFile(source,new File("./Screenshots/"+testCaseName +timestamp+".png"));
	}

}
