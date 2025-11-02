package steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

public class SearchSteps extends UIInteractions {

    @Step("Open the Google home page")
    public void openGoogleHomePage() {
        openUrl("https://www.google.com");
    }

    @Step("Search for {0}")
    public void searchFor(String keyword) {
        $(By.name("q")).sendKeys(keyword + "\n");
    }

    @Step("Verify results related to {0}")
    public void shouldSeeResults(String keyword) {
        $("//h3[contains(.,'" + keyword + "')]").waitUntilVisible();
    }
}
