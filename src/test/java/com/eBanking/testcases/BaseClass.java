package com.eBanking.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.eBanking.utilities.Screenshots_Utility;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	@BeforeClass
	public void setup() throws IOException  {		
	FileInputStream f1 = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\eBanking\\properties\\config.properties");
	prop = new Properties();
	prop.load(f1);
	logger = Logger.getLogger("eBanking");
	PropertyConfigurator.configure("log4j.properties");
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\java\\com\\eBanking\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("http://demo.guru99.com/v4");
	driver.get(prop.getProperty("URL"));
	logger.info("URL is launched");
}
	
	@AfterClass
	public void tearDown() {
	//	driver.close();
	}
	@AfterMethod
	public void takescreenshots(ITestResult result) throws Exception {
		Screenshots_Utility.Screenshot(BaseClass.driver, result.getName());
		
	}
}
