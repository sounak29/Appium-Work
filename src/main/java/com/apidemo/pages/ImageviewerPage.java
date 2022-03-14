package com.apidemo.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.apidemo.utitlity.Scroll;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ImageviewerPage {

	 Logger log = LogManager.getLogger(ImageviewerPage.class);

	
	AppiumDriver<MobileElement> driver;
	public ImageviewerPage(AppiumDriver<MobileElement> driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='10' and @text='Views']")
	public WebElement views;
	
	
	@FindBy(how=How.XPATH, using="//android.widget.TextView[@text='ImageView']")
	public WebElement imageviewer;
	
	public void clickViews()
	{
		log.info("click on Views");
		views.click();
	}
	
	public void clickImageViewer()
	{
		log.info("Scroll vertically........");
		Scroll.verticalScrollByElement(driver,"ImageView");
		
		log.info("click on Image Viewer");
		imageviewer.click();
	}
	
	
	@FindBy(how=How.XPATH, using="//android.widget.ImageView[@index='1']")
	public WebElement largeimagecheck;
	
	
	@FindBy(how=How.XPATH, using="//android.widget.ImageView[@index='3']")
	public WebElement smallimagecheck;
	
	
	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='0']")
	public WebElement pagetitle;
	
	
	public boolean isLargeIamageVisible()
	{
		log.info("checking  large image visibility...........");

		return largeimagecheck.isDisplayed();
	}
	
	
	public boolean isSmallIamageVisible()
	{
		log.info("checking  small image visibility...........");

		return smallimagecheck.isDisplayed();
	}
	
	
	public String checkTitle()
	{
		log.info("screen title checking......... ");

		return pagetitle.getText();
	}
	
	
	
}

