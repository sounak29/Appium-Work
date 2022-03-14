package StepDefination;

import org.testng.Assert;

import com.apidemo.pages.AddtextPage;
import com.apidemo.test.BaseTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtextSteps extends BaseTest {
	
	AddtextPage add=new AddtextPage(driver);
	
	@When("user click on Text")
	public void user_click_on_text() {
		add.clickText();
	}

	@When("user click on Log TextBox")
	public void user_click_on_log_text_box() {
		add.clickLogTextBox();
	}

	@When("user click on Add")
	public void user_click_on_add() {
		add.clickAdd();
	}

	@Then("user able to see the screen title as {string}")
	public void user_able_to_see_the_screen_title_as(String string) {
		String actual=add.getTitle();
		Assert.assertEquals(actual, string);

	}
	
	@Then("Text is added as {string}")
	public void text_is_added_as(String string) {
		String actual=add.getText().trim();
		Assert.assertEquals(actual, string);
	}


}
