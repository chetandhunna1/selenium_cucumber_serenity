package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchStepDefinitions {

    // Initialize your Serenity page object
    SearchSteps searchSteps = new SearchSteps();

    // Static block to setup ChromeDriver before any tests run
  /*
    static {
        WebDriverManager.chromedriver().setup();
    }
*/
    @Given("I open the Google home page")
    public void openHomePage() {
        searchSteps.openGoogleHomePage();
    }

    @When("I search for {string}")
    public void searchFor(String term) {
        searchSteps.searchFor(term);
    }

    @Then("I should see results related to {string}")
    public void verifyResults(String term) {
        searchSteps.shouldSeeResults(term);
    }


}
