package pages.Webshop;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public class Webshop extends PageObject {


    public String url = "https://demowebshop.tricentis.com/";
    public String userEmail = "myemail19@email.com";
    public String userPassword = "Password@123";

    @FindBy(xpath = "//*[@class='ico-login']")
     WebElement login_link;

    @FindBy(xpath  = "//a[@href='/logout']")
    WebElement logout_link;

    @FindBy(xpath  = "//a[@href='/register']")
    WebElement register_link;

    @FindBy(xpath  = "//span[@class='cart-label']")
    WebElement shopping_cart;

    @FindBy(xpath  = "//input[@class='email']")
    WebElement email;

    @FindBy(xpath  = "//input[@class='password']")
    WebElement password;


    @FindBy(xpath  = "//input[@class='button-1 login-button']")
    WebElement login_Button;



public void openPage() throws InterruptedException {
    openUrl(url);


}

public void loginLink()
{
    login_link.click();
//Test

}
public void enterCreds()
{
    email.sendKeys(userEmail);
    password.sendKeys(userPassword);
    login_Button.click();

}



}
