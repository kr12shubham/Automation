package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {

	@Given("^User is on NetBanking landing$")
	public void user_is_on_netbanking_landing() throws Throwable {
		System.out.println("Navigated to url");
	}

	@When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_username_something_and_password_something(String strArg1,
			String strArg2) throws Throwable {
		System.out.println(strArg1);
		System.out.println(strArg2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Validated Homepage");
	}

	@And("^Cards are displayed \"([^\"]*)\"$")
	public void cards_are_displayed_something(String strArg1) throws Throwable {
		System.out.println(strArg1);
	}

}