package stepdefinitinions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.phpTravels_page;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class phpTravels_step_Def {

    phpTravels_page pages  = new phpTravels_page();

    @Given("kullanici {string} url ine gider")
    public void kullanici_url_ine_gider(String deneme_url) {
        Driver.getDriver().get(ConfigurationReader.getProperty("deneme_url"));
    }

    @Given("kullanici {string} girer")
    public void kullanici_girer(String email) {
       pages.email.sendKeys(email);

    }

    @And("kullanici sifreyi {string} girer")
    public void kullaniciSifreyiGirer(String sifre) {
        pages.sifre.sendKeys(sifre);
    }

    @Then("kullanici giris yapar")
    public void kullanici_giris_yapar() {
        BrowserUtils.waitFor(3);
        pages.loginButonu.click();
    }

    @Given("kullanici accounts linkine tiklar")
    public void kullanici_accounts_linkine_tiklar() {
        BrowserUtils.waitFor(3);
       pages.account.click();
    }

    @Given("kullanici custemers secenegine tiklar")
    public void kullanici_custemers_secenegine_tiklar() {
        BrowserUtils.waitFor(3);
       pages.custemersSecenegi.click();
    }

    @Given("kullanici add  linkine tiklar")
    public void kullanici_add_linkine_tiklar() {
        BrowserUtils.waitFor(3);
        pages.addlinki.click();
    }

    @Given("kullanici firstname checkbox ina {string} girer")
    public void kullanici_firstname_checkbox_ina_girer(String firstname) {
        BrowserUtils.waitFor(3);
       pages.fistname.sendKeys(firstname);
    }

    @Given("kullanici lastname checkbox ina {string} girer")
    public void kullanici_lastname_checkbox_ina_girer(String lastname) {
        BrowserUtils.waitFor(3);
        pages.lastname.sendKeys(lastname);
    }

    @Given("kullanici email checkbox ina {string} girer")
    public void kullanici_email_checkbox_ina_girer(String email2) {
        BrowserUtils.waitFor(3);
        pages.email2.sendKeys(email2);
    }

    @Given("kullanici password checkbox ina {string} girer")
    public void kullanici_password_checkbox_ina_girer(String sifre) {
        BrowserUtils.waitFor(3);
        pages.password2.sendKeys(sifre);
    }

    @Given("kullanici mobilNumber checkbox ina {string} girer")
    public void kullanici_mobil_number_checkbox_ina_girer(String mobil) {
        BrowserUtils.waitFor(3);
        pages.mobileNumber.sendKeys(mobil);
    }

//    @Given("kullanici country checkbox ina {string} girer")
//    public void kullanici_country_checkbox_ina_girer(String string) {

    @And("kullanici country checkbox ina Turkey girer")
    public void kullaniciCountryCheckboxInaTurkeyGirer() {

        BrowserUtils.waitFor(5);
        Select select =new Select(pages.country);
        select.selectByVisibleText("Turkey");

    }

    @Given("kullanici adress1 checkbox ina {string} girer")
    public void kullanici_adress1_checkbox_ina_girer(String adress1) {
        BrowserUtils.waitFor(3);
        pages.adress1.sendKeys(adress1);
    }

    @Given("kullanici adress2 checkbox ina {string} girer")
    public void kullanici_adress2_checkbox_ina_girer(String adress2) {
        pages.adress2.sendKeys(adress2);
    }

    @Given("kullanici Email Newsletter Subscriber checkbox ini tiklar")
    public void kullanici_email_newsletter_subscriber_checkbox_ini_tiklar() {
        pages.checkBox.click();
    }

    @Then("kullanici submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {
        pages.submitButton.click();
    }


}
