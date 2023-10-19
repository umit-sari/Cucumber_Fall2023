package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.ConfigReader;

public class QualitydemyStepdefinitions {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();

    @Then("ilk login linkine tiklar")
    public void ilk_login_linkine_tiklar() {
        qualitydemyPage.ilkLoginLinki.click();
    }

    @Then("username kutusuna {string} yazar")
    public void username_kutusuna_yazar(String kullaniciEmail) {
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty(kullaniciEmail));

    }
    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String password) {
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(password));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        qualitydemyPage.loginButonu.click();
    }
    @Then("basarili giris yapildigini test eder")
    public void basarili_giris_yapildigini_test_eder() {
        Assert.assertTrue(qualitydemyPage.basariliGirisElementi.isDisplayed());
    }

    @Then("basarili giris yapilamadigini test eder")
    public void basariliGirisYapilamadiginiTestEder() {
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
    }


    @And("kullanici cookies'i kabul eder")
    public void kullaniciCookiesIKabulEder() {
        qualitydemyPage.cookieButton.click();

    }

    @And("kullanici ikinci cookies'i kabul eder")
    public void kullaniciIkinciCookiesIKabulEder() {
        qualitydemyPage.cookie2Butonu.click();

    }
    @Then("username kutusuna examples'dan {string} yazar")
    public void username_kutusuna_examples_dan_yazar(String kullaniciEmail) {
        qualitydemyPage.emailKutusu.sendKeys(kullaniciEmail);

    }
    @Then("password kutusuna examples'dan {string} yazar")
    public void password_kutusuna_examples_dan_yazar(String kullaniciPassword) {
        qualitydemyPage.emailKutusu.sendKeys(kullaniciPassword);

    }


    }
