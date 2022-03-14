package StepDefination;

import org.testng.Assert;

import com.apidemo.pages.ImageviewerPage;
import com.apidemo.test.BaseTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ImageviewerSteps extends BaseTest{
	
	ImageviewerPage image=new ImageviewerPage(driver);

	@When("user click on Views")
	public void user_click_on_views() {
		image.clickViews();
	}

	@When("user click Image Viewer")
	public void user_click_image_viewer() {
		image.clickImageViewer();

	}
	@Then("user is on the {string} page")
	public void user_is_on_the_page(String string) {
		String actual=image.checkTitle();
		Assert.assertEquals(string, actual);
	}

	@Then("user shoud see the images")
	public void user_shoud_see_the_images() {
		Assert.assertEquals(true, image.isLargeIamageVisible());
		Assert.assertEquals(true, image.isSmallIamageVisible());

	}
	
}
