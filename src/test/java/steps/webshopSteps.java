package steps;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;
import pages.Webshop.Webshop;


public class webshopSteps extends UIInteractions  {


    Webshop webshop;

    @Step("I open the Webshop home page")
    public void openwebshopPage() throws InterruptedException {
        webshop.openPage();

    }
    @Step("I click on the Log in Button")
    public void clickLoginLink(){
        webshop.loginLink();
    }

    @Step("enter the credentials")
    public void enterCredentials(){
        webshop.enterCreds();
    }





}
