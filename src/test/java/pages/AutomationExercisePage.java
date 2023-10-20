package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement loginLinki;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;

    @FindBy (xpath="//a[@href='/logout']")
    public WebElement logoutYazisi; // dogrulama islemi icin


}
