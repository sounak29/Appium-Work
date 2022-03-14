package com.apidemo.utitlity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Explicitwait {
	
	public static void wait(AppiumDriver<MobileElement> driver,WebElement element, int time)
	{
		new WebDriverWait(driver, time).until(ExpectedConditions.elementToBeClickable(element));

	}

}
