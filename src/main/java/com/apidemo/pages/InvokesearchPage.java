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

public class InvokesearchPage {

	 Logger log = LogManager.getLogger(InvokesearchPage.class);

		
	AppiumDriver<MobileElement> driver;
	public InvokesearchPage(AppiumDriver<MobileElement> driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='10' and @text='Search']")
	public WebElement search;
	
	
	public void clickSearch()
	{
		log.info("click on Search");
		
		Explicitwait.waitByXpath(driver,"//android.widget.TextView[@index='10' and @text='Search']" , 15);

		search.click();
	}
	

	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='0' and @text='Invoke Search']")
	public WebElement invokeSearch;
	
	public void clickInvokeSearch()
	{
		log.info("click on Invoke Search");
		
		Explicitwait.waitByXpath(driver,"//android.widget.TextView[@index='0' and @text='Invoke Search']" , 15);

		
		invokeSearch.click();
	}
	

	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='0']")
	public WebElement titleSearch;
	
	public String getTitleSearch()
	{
		log.info("screen title checking......... ");

		return titleSearch.getText();
	}
	
	@FindBy(how=How.XPATH, using="//android.widget.EditText[@resource-id='io.appium.android.apis:id/txt_query_prefill']")
	public WebElement prefilquery;
	
	@FindBy(how=How.XPATH, using="//android.widget.EditText[@resource-id='io.appium.android.apis:id/txt_query_appdata']")
	public WebElement appdata;
	
	public void enterText(String query,String data)
	{
		log.info("entering search data");
	
		prefilquery.sendKeys(query);
		appdata.sendKeys(data);
	}
	

	@FindBy(how=How.XPATH, using="//android.widget.Button[@index='2' and @text='ONSEARCHREQUESTED()']")
	public WebElement searchRqst;
	
	public void clickSearchRqst()
	{
		log.info("click on search request");
		
		searchRqst.click();
	}
	
	
	

	@FindBy(how=How.XPATH, using="//android.widget.TextView[@index='0']")
	public WebElement searchpage;
	
	public String getTitle()
	{
		log.info("screen title checking......... ");

		Explicitwait.waitByXpath(driver,"//android.widget.TextView[@index='0']", 15);

		return searchpage.getText();
	}

}
