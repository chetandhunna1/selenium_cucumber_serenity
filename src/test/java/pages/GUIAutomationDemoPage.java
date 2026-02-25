package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class GUIAutomationDemoPage extends PageObject {

    public String url = "https://www.service.nsw.gov.au/transaction/check-motor-vehicle-stamp-duty";

    @FindBy(xpath = "//*[@class='button button--primary is-external']")
    WebElement Check_online;

    @FindBy(xpath = "//*[@id='skip']")
    WebElement Revenue_NSW_calculators;

    @FindBy(xpath = "//label[contains(normalize-space(),'Yes')]")
    WebElement RadioButton_Yes;

    @FindBy(xpath = "//input[@id='purchasePrice']")
    WebElement Purchase_Price;

    @FindBy(xpath = "//button[normalize-space()='Calculate']")
    WebElement Calculate;

    @FindBy(xpath = "//h4[normalize-space()='Calculation']")
    WebElement Calculation_Header;

    @FindBy(xpath = "//table//tr[td[normalize-space()='Is this registration for a passenger vehicle?']]//td[2]")
    WebElement registrationStatus;

    @FindBy(xpath = "//table//tr[td[normalize-space()='Purchase price or value']]//td[2]")
    WebElement Entered_Value;
    public String passedValue ="";

    public void openUrl() throws InterruptedException {
        openUrl(url);
    }

    public void click_online_Button(){
        waitFor(Check_online).waitUntilVisible();
        Check_online.click();
    }

    public boolean validateCalculatorPage(){
        waitFor(Revenue_NSW_calculators).waitUntilVisible();
        if(Revenue_NSW_calculators.isDisplayed())
            return true;
        else return false;
    }
    public void revenue(String amt)  {
        passedValue = amt;
        RadioButton_Yes.click();
        Purchase_Price.sendKeys(amt);
        WebElement inputElement = getDriver().findElement(By.xpath("//input[@id='purchasePrice']"));
        String inputValue = inputElement.getAttribute("value");
        inputValue=inputValue.replace(",","");
        assertEquals(inputValue,amt);
        Calculate.click();
        //Test

    }

    public void validateWindow(){
        waitFor(Calculation_Header).waitUntilVisible();
    }

    public boolean vehicleRegistraion(){
        if(registrationStatus.getText().equalsIgnoreCase("Yes"))
            return true;
        else
            return false;
    }

    public String fetch_Amount(){
        String displayAmount = Entered_Value.getText().substring(1,(Entered_Value.getText().length()-3)).replace(",","");
        return displayAmount;
    }
}