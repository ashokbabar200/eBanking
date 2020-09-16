package com.eBanking.Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.eBanking.testcases.LoginTest;

public class LoginPage extends LoginTest{    
	
	public void doLogin() {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(prop.getProperty("username"));
		logger.info("username is entered");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		String actualTitle = driver.findElement(By.xpath("//h2[contains(text(),'Guru')]")).getText();
			
			}
}
