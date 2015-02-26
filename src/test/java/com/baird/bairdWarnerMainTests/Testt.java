package com.baird.bairdWarnerMainTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testt {
static HtmlUnitDriver unitDriver;
	@BeforeTest
	public static void setup(){
	unitDriver = new HtmlUnitDriver(true);
	unitDriver.get("http://google.com");
	System.out.println("Title of this page is ->" + unitDriver.getTitle());
	}
	
	@Test
	public static void test(){
	WebElement searchBox = unitDriver.findElement(By.name("q"));
	searchBox.sendKeys("Selenium");
	WebElement button = unitDriver.findElement(By.name("gbqfba"));
	button.click();
	
	}
	
	@AfterTest
	public void close(){
	System.out.println("Title of this page is ->" + unitDriver.getTitle());
	unitDriver.quit();
	}
}
