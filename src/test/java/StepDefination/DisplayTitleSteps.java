package StepDefination;

import org.testng.Assert;

import com.apidemo.pages.DisplayoptionPage;
import com.apidemo.test.BaseTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DisplayTitleSteps extends BaseTest {
	
	DisplayoptionPage dis=new DisplayoptionPage(driver);


	@When("user click on Apps")
	public void user_click_on_apps() {
		dis.clickApps();

	}

	@When("user click on Action Bar button")
	public void user_click_on_action_bar_button() {
		dis.clickActionBar();

	}

	@When("user click on Display Option")
	public void user_click_on_display_option() {
		dis.clickDisplayOption();
	}

	@When("user click on Display Show Title button")
	public void user_click_on_display_show_title_button() {
		dis.clickShowTitle();
		dis.clickShowTitle();
	}

	@Then("user able to see the title {string}")
	public void user_able_to_see_the_title(String string) {		
		Assert.assertEquals(dis.checkTitle(), string);
	}

}
