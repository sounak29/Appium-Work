package com.apidemo.utitlity;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Scroll {

	//method to scroll vertical using element name
	public static void verticalScrollByElement(AppiumDriver<MobileElement> driver,String elementName)
	{
	
		
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\""+elementName+"\"))"
				));
		
	}
}