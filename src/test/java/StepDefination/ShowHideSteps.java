package StepDefination;

import org.testng.Assert;

import com.apidemo.pages.AnimationPage;
import com.apidemo.test.BaseTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShowHideSteps extends BaseTest {


	AnimationPage show=new AnimationPage(driver);

	@When("user click on Animation")
	public void user_click_on_animation() {

		show.clickAnimation();
	}

	@When("user click Hide-Show Animation")
	public void user_click_hide_show_animation() {
		show.clickShowHide();
	}

	@When("user click on button {int}  and {int} to hide")
	public void user_click_on_button_and_to_hide(Integer int1, Integer int2) {
		show.clickHide();
	}

	@When("user click on Show buttons")
	public void user_click_on_show_buttons() {

		show.clickShowBtn();
	}

	@Then("user able to see the button {int} and {int}")
	public void user_able_to_see_the_button_and(Integer int1, Integer int2) {
		Assert.assertEquals(true,show.checkbutton0Visibility());
		Assert.assertEquals(true,show.checkbutton1Visibility());


	}

	@Then("user is on the {string} Activity")
	public void user_is_on_the_activity(String string) {
		Assert.assertEquals(string, show.checkTitle());
	}

	@Then("use only see the remaining buttons that are {string} and {string}")
	public void use_only_see_the_remaining_buttons_that_are_and(String string, String string2) {
		String one=show.getText2();
		String two=show.getText3();
		Assert.assertEquals(string, one);
		Assert.assertEquals(string2, two);
	}

}
