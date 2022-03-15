package com.apidemo.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.apidemo.utitlity.Explicitwait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AnimationPage {
	
	 Logger log = LogManager.getLogger(AnimationPage.class);

	
	AppiumDriver<MobileElement> driver;
	public AnimationPage(AppiumDriver<MobileElement> driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='5']")
	public WebElement showHide;
	
	public void clickShowHide()
	{
		log.info("click on Hide-Show Animation button ");
		
		Explicitwait.waitByXpath(driver, "//android.widget.TextView[@index='5']", 15);
		
		showHide.click();
	}
	

	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='1']")
	public WebElement animation;
	
	public void clickAnimation()
	{
		log.info("click on the Animation button");
		animation.click();
	}
	@FindBy(how=How.XPATH, using="//android.widget.Button[@text='0']")
	public WebElement hideButton0;
	
	@FindBy(how=How.XPATH, using="//android.widget.Button[@text='1']")
	public WebElement hideButton1;
	
	@FindBy(how=How.XPATH, using="//android.widget.Button[@text='2']")
	public WebElement hideButton2;
	
	@FindBy(how=How.XPATH, using="//android.widget.Button[@text='3']")
	public WebElement hideButton3;


	
	public void clickHide()
	{
		log.info("click on buttons to hide");

		hideButton0.click();
		hideButton1.click();
	}
	
	@FindBy(how=How.XPATH, using="//android.widget.Button[@text='SHOW BUTTONS']")
	public WebElement showbtn;
	
	public void clickShowBtn()
	{
		log.info("Click on Show button ");

		showbtn.click();
	}
	
	public boolean checkbutton0Visibility()
	{
		log.info("check the 1st button visibility");

		return hideButton0.isDisplayed();
	}
	
	public boolean checkbutton1Visibility()
	{
		log.info("Check the 2nd button visibility");

		return hideButton1.isDisplayed();
	}
	
	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='0']")
	public WebElement title;
	
	public String checkTitle()
	{
		log.info("screen title checking......... ");


		return title.getText();
	}

	public String getText2()
	{
		log.info("extracting the buttons title");

		return hideButton2.getText();
	}
	public String getText3()
	{
		log.info("extracting the buttons title");

		return hideButton3.getText();
	}
	
	
}
