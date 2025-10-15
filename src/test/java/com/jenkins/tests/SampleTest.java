package com.jenkins.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class SampleTest {
	WebDriver driver;
@Test
	public void launch() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("successfully opend swaglab");
}
		@Test
		public void validlogin() {
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
		}
		
	@Test
	public void invalidlogin() {
		driver.findElement(By.id("user-name")).sendKeys("standar");
		driver.findElement(By.id("password")).sendKeys("secret");
		driver.findElement(By.id("login-button")).click();
		driver.quit();
	}
}
