package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.webshopSteps;

public class webshopGlue {

    webshopSteps wsSteps;

    @Given("I open the Webshop home page")
    public void i_open_the_webshop_home_page() throws InterruptedException {
        wsSteps.openwebshopPage();

    }
    @Then("I click on the Log in Button")
    public void i_click_on_the_log_in_button() {
        wsSteps.clickLoginLink();
    }
    @Then("enter the credentials")
    public void enter_the_credentials() {
       wsSteps.enterCredentials();

    }




}
