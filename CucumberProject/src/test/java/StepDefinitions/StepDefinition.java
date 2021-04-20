package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {

	@Given("^navigate to something page$")
	public void navigate_to_something_page() throws Throwable {
		System.out.println("navigate to homepage");
	}

	@When("^user provide valid (.+) and (.+)$")
	public void user_provide_valid_and(String username, String password) throws Throwable {

		System.out.println(username);
		System.out.println(password);
	}

	@Then("^user should logged in successfully$")
	public void user_should_logged_in_successfully() throws Throwable {
		System.out.println("successfully happed");
	}

}