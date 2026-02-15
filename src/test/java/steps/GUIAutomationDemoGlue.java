package steps;


import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GUIAutomationDemoPage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class GUIAutomationDemoGlue {

    GUIAutomationDemoPage GUIAutomationDemo;


    @Given("I open the NSW motor vehicle stamp duty page")
    public void i_open_the_nsw_motor_vehicle_stamp_duty_page() throws InterruptedException {
        GUIAutomationDemo.openUrl();
    }

    @Given("The user clicks on Check Online button to assert the subsequent page opens")
    public void the_user_clicks_on_check_online_button_to_assert_the_subsequent_page_opens() {
        GUIAutomationDemo.click_online_Button();
    }

    @When("User Assert the contents of the popup window")
    public void user_assert_the_contents_of_the_popup_window()  {

        GUIAutomationDemo.validateWindow();
        assertTrue(GUIAutomationDemo.vehicleRegistraion());
        assertEquals(GUIAutomationDemo.fetch_Amount(),GUIAutomationDemo.passedValue);
    }

    @When("User clicks on Yes and enter a vehicle amount as {string} and click the calculate button")
    public void userClicksOnYesAndEnterAVehicleAmountAsAndClickTheCalculateButton(String value) {
        assertTrue(GUIAutomationDemo.validateCalculatorPage());
        GUIAutomationDemo.revenue(value);
    }
}
