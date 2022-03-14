package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/Feature",
		glue = {"StepDefination","Hooks"},
	    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	    tags="@Addtext or @Showbutton or @Title or @Imageviewer or @Hidebutton",
		monochrome=true,
		publish=true
		
		)


public class TestRunner extends AbstractTestNGCucumberTests{
		
}
