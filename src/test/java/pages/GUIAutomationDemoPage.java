package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

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
    WebElement Yes_displayed;

    @FindBy(xpath = "//table//tr[td[normalize-space()='Purchase price or value']]//td[2]")
    WebElement Entered_Value;


    public void openUrl() throws InterruptedException {
        openUrl(url);
    }

    public void click_online_Button(){
        waitFor(Check_online).waitUntilVisible();
        Check_online.click();
    }
    public void revenue() throws InterruptedException {
        waitFor(Revenue_NSW_calculators).waitUntilVisible();
        RadioButton_Yes.click();
        Purchase_Price.sendKeys("45000");
        Thread.sleep(7000);
        WebElement inputElement = getDriver().findElement(By.xpath("//input[@id='purchasePrice']"));
        String inputValue = inputElement.getAttribute("value");
        System.out.println("Input field value: " + inputValue);
        Calculate.click();
    }

    public void calulationWindow(){
        waitFor(Calculation_Header).waitUntilVisible();






    }
}