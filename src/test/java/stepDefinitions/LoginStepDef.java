package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStepDef {
    private final LoginPage googlePage = new LoginPage();

    @Given("I am on Google homepage")
    public void i_am_on_google_homepage() {
        googlePage.openHomePage();
    }

    @When("I search for {string}")
    public void i_search_for(String query) {
        googlePage.searchFor(query);
    }

    @Then("I should see results related to {string}")
    public void i_should_see_results_related_to(String keyword) {
        assertTrue(googlePage.getTitle().contains(keyword));
    }

}
