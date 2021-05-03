package stepDefinitions;

import org.junit.Assert;

import com.qa.Factory.DriverFactory;
import com.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageStepdef {
	
	private LoginPage loginPage  = new LoginPage(DriverFactory.getDriver());

	@Given("user is on accountLogin Page")
	public void user_is_on_account_login_page() {
		DriverFactory.getDriver()
		.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@Then("user verify the title of the Page as {string}")
	public void user_verify_the_title_of_the_page_as(String expectedTitleName) {
	 String title = loginPage.getTitle();
	 System.out.println("Page title is: " + title);
	 Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("user verify the forgot password link is available")
	public void user_verify_the_forgot_password_link_is_available() {
	  Assert.assertTrue(loginPage.forgottenPwdLinkExist());
	}

	@Then("user enters emailId as {string}")
	public void user_enters_email_id_as(String email) {
	    loginPage.getUsername(email);
	}

	@Then("User enters password as {string}")
	public void user_enters_password_as(String pwd) {
		loginPage.getPassword(pwd);
	}

	@Then("user clicks on Login button")
	public void user_clicks_on_login_button() {
	   loginPage.doClick();
	}

	@Then("user gets the title of the home page")
	public void user_gets_the_title_of_the_home_page() {
	String homePageTitle =  loginPage.getTitle();
	System.out.println(homePageTitle);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String homepageTitle) {
		String title =  loginPage.getTitle();
	  Assert.assertTrue(title.contains(homepageTitle));
	}

}
