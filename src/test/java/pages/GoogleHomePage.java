package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class GoogleHomePage extends PageObject {

    private By searchBox = By.name("q");

    public void openHomePage() {
        openUrl("https://www.google.com");
    }

    public void searchFor(String term) {
        $(searchBox).typeAndEnter(term);
    }
}
