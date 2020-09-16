package com.eBanking.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eBanking.Pages.LoginPage;

public class LoginTest extends BaseClass{
	@Test
	public void logintoapp() {		
		LoginPage lp =new LoginPage();
		lp.doLogin();
		
		String actualTitle = driver.findElement(By.xpath("//h2[contains(text(),'Guru')]")).getText();
		System.out.println("acutal title is :"+actualTitle);
		
		if(actualTitle.equalsIgnoreCase("Guru99 Bank")){
			Assert.assertTrue(true);
			}
			else {
			Assert.assertTrue(false);
			}
		
	}
	

}
