package com.apidemo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseTest {
	
	static File congigFile =new File("./Resources/Config.properties");
	static FileInputStream configFis=null;
	static Properties configProp =new Properties();
	
	
	static 
	{

		try {
			configFis = new FileInputStream(congigFile);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			configProp.load(configFis);
		} catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static AppiumDriver<MobileElement> driver=null;
	
    static Logger log = LogManager.getLogger(BaseTest.class);

	 
	static AppiumDriverLocalService service;


	//method to start the appium
	public static void start()
	{
		log.info("starting Appium..........");
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	}


	//method to set capability and set host and port number and initialize driver
	public static void setup()
	{
		log.info("initialize driver..........");


		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("platformVersion","8.1");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("appPackage","io.appium.android.apis");
		capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");
		capabilities.setCapability("app","./Application/ApiDemos-debug.apk");
		capabilities.setCapability("deviceName","Android");
		capabilities.setCapability("isHeadless", configProp.getProperty("HeadlessValue"));
		try
		{
			driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	

	//method to stop the driver
	public static void stop()
	{
		log.info("closing driver........");
		driver.quit();
	}
	//method to close the appium
	public static void closeAppium()
	{
		log.info("closing Appium............");
		service.stop();
	}
	


}
