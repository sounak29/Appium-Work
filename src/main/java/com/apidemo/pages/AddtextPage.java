package com.apidemo.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apidemo.utitlity.Explicitwait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AddtextPage {
	
	 Logger log = LogManager.getLogger(AddtextPage.class);
	
	AppiumDriver<MobileElement> driver;
	public AddtextPage(AppiumDriver<MobileElement> driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='9']")
	public WebElement text;
	
	public void clickText()
	{
		log.info("click on Text");
		text.click();
	}
	
	
	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='1']")
	public WebElement logTextBox;
	
	public void clickLogTextBox()
	{
		log.info("click on Log Text");
		
		Explicitwait.waitByXpath(driver,"//android.widget.TextView[@index='1']" , 15);
		
		logTextBox.click();
	}
	
	@FindBy(how=How.XPATH, using="//android.widget.Button[@index='0']")
	public WebElement add;
	
	
	public void clickAdd()
	{
		log.info("click on Add");
		
		add.click();
	}
	
	
	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='1']")
	public WebElement disText;
	
	public String getText()
	{
		
		log.info("checking added text......... ");

		return disText.getText();
		
	}
	
	
	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='0']")
	public WebElement disTitle;
	
	public String getTitle()
	{
		log.info("screen title checking......... ");

		return disTitle.getText();
		
	}

}
