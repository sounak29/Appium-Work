package Hooks;







import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.apidemo.test.BaseTest;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;



public class Hook extends BaseTest{
	

	@Before
	public void browserSetup()
	{
		BaseTest.start();
		BaseTest.setup();
	}
	
	@After
	public void tearDown()
	{
		BaseTest.stop();
		BaseTest.closeAppium();
	
	}
	
	//method to add screenshot in the report
	@AfterStep
	public static void addScreenshot(Scenario scenario)
	{

		//validate if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image"); 
		}
		
	}
	

}
