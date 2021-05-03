package stepDefinitions;

import java.util.List;

import org.junit.Assert;

import com.qa.Factory.DriverFactory;
import com.qa.pages.LoginPage;
import com.qa.pages.MyAccountPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountPageStepDef {
	
	private LoginPage loginPage  = new LoginPage(DriverFactory.getDriver());
	private MyAccountPage accountPage;
	
	@Given("user is on login Page")
	public void user_is_on_login_page(DataTable dataTable) {
	  List<String> credList = dataTable.asList();
	  String username = credList.get(0);
	  String Password = credList.get(1);
	  DriverFactory.getDriver()
		.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	  accountPage = loginPage.doLogin(username,Password);
	 
	}

	@Given("the user is on account Page")
	public void the_user_is_on_account_page() {
		Assert.assertTrue(accountPage.headerDispayCheck());
	}

	@Then("Verify the title of the Page {string}")
	public void verify_the_title_of_the_page(String expectedTitle) {
	    String actualTitle = accountPage.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	}

	@When("the user collect the personal information of all orders")
	public void the_user_collect_the_personal_information_of_all_orders() {
	   accountPage.getAccountHeaderListCount();
	}

	@Then("verify the Count of the  Account header should be {int}")
	public void verify_the_count_of_the_account_header_should_be(Integer expCount) {
		int actualCount =  accountPage.getAccountHeaderListCount();
		Assert.assertTrue(actualCount==expCount);
	}

	@When("the user collect the personal information of all orders List")
	public void the_user_collect_the_personal_information_of_all_orders_list() {
	  accountPage.getAccountHeaderList();
	}

	@Then("verify the text of the  Account header")
	public void verify_the_text_of_the_account_header(DataTable dataTable) {
	 List<String> expectedHeaderList = dataTable.asList();
	List<String> actualList = accountPage.getAccountHeaderList();
	Assert.assertTrue(expectedHeaderList.containsAll(actualList));
	//Assert.assertTrue(actualList==expectedHeaderList);
	    
	}


}
