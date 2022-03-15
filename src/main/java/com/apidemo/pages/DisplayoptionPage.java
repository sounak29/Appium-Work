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

public class DisplayoptionPage {
	
	 Logger log = LogManager.getLogger(DisplayoptionPage.class);

	
	AppiumDriver<MobileElement> driver;
	public DisplayoptionPage(AppiumDriver<MobileElement> driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='2']")
	public WebElement apps;
	

	
	public void clickApps()
	{
		log.info("click on Apps");
		apps.click();
	}
	
	
	
	@FindBy(how=How.XPATH, using="//android.widget.Button[@index='3']")
	public WebElement showTitle;
	
	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='4']")
	public WebElement displayoption;

	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='0' and @text='Action Bar']")
	public WebElement actionBar;
	
	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='0']")
	public WebElement title;
	
	
	
	public void clickActionBar()
	{
		log.info("click on Action Bar");

		Explicitwait.wait(driver,actionBar,15);

		actionBar.click();
	}
	
	public void clickDisplayOption()
	{
		log.info("click on Display Options");
		
		Explicitwait.waitByXpath(driver,"//android.widget.TextView[@index='4']" , 15);
		
		displayoption.click();
	}
	
	public void clickShowTitle()
	{
		log.info("click on Show Title");
		
		showTitle.click();
	}
	
	public String checkTitle()
	{
		log.info("screen title checking......... ");

		
		return title.getText();
	}
}
