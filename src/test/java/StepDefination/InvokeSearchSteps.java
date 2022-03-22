package StepDefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.apidemo.pages.InvokesearchPage;
import com.apidemo.test.BaseTest;
import com.apidemo.utitlity.ExcelReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvokeSearchSteps extends BaseTest {

	InvokesearchPage search=new InvokesearchPage(driver);

	@When("user click on search")
	public void user_click_on_search() {
		search.clickSearch();
	}

	@When("user click on invoke search")
	public void user_click_on_invole_search() {
		search.clickInvokeSearch();
	}

	@Then("user see title as {string}")
	public void user_see_title_as(String string) {
		Assert.assertEquals(string,search.getTitleSearch() );
	}

	@When("user enter search details from excel sheet name is  {string} and row number {int}")
	public void user_enter_search_details_from_excel_sheet_name_is_and_row_number(String sheetname, Integer rownum) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testdata =reader.getData("./Resources/Testdata.xlsx", sheetname);

		String query=testdata.get(rownum).get("Prefill query");
		String appdata=testdata.get(rownum).get("App Data");
		
		search.enterText(query, appdata);
		
		

		
	}


	@When("click on On Search Request button")
	public void click_on_on_search_request_button() {
		search.clickSearchRqst();
	}

	@When("click on enter")
	public void click_on_enter() {
		Actions action =new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		

	}

	@Then("user  {string} page")
	public void user_page(String string) {
		Assert.assertEquals(string,search.getTitle());
	}

	

}
