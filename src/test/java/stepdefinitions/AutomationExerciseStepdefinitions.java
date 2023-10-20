package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationExerciseStepdefinitions {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();

    @Given("kullanici aeUrl anasayfaya gider")
    public void kullanici_ae_url_anasayfaya_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));

    }
    @Then("kullanici login linkine tiklar")
    public void kullanici_login_linkine_tiklar() {
        automationExercisePage.loginLinki.click();

    }
    @Then("kullanici dogru bilgilerle giris yapar")
    public void kullanici_dogru_bilgilerle_giris_yapar() {
        automationExercisePage.emailKutusu.sendKeys(ConfigReader.getProperty("aeUsername"));
        automationExercisePage.passwordKutusu.sendKeys(ConfigReader.getProperty("aePassword"));
        automationExercisePage.loginButton.click();

    }
    @Then("basarili giris yapildigini dogrular")
    public void basarili_giris_yapildigini_dogrular() {

        String expectedVerify="Logout";
        String actualVerify=automationExercisePage.logoutYazisi.getText();
        Assert.assertTrue(actualVerify.contains(expectedVerify));


    }



}
