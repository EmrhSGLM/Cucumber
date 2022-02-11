package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HotelMyCampStepDefinitions {

    HMCPage hmcPage = new HMCPage();



    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {
        hmcPage.firstLoginButton.click();
    }
    @Then("kullanici adi olarak {string} girer")
    public void kullanici_adi_olarak_girer(String kullaniciTipi) {
        hmcPage.userNameTextBox.sendKeys(ConfigReader.getProperty(kullaniciTipi));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String password) {
        hmcPage.passwordTextBox.sendKeys(ConfigReader.getProperty(password));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmcPage.secondLoginButton.click();
    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(hmcPage.basariliGirisYaziElementi.isDisplayed());
    }


    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcPage.girisYapilamadiYaziElementi.isDisplayed());
  }


    @Then("scenario outline'dan kullanici adi olarak {string} yazar")
    public void scenarioOutlineDanKullaniciAdiOlarakYazar(String username) {
        hmcPage.userNameTextBox.sendKeys(username);
    }

    @And("scenario outline'dan password olarak {string} yazar")
    public void scenarioOutlineDanPasswordOlarakYazar(String password) {
        hmcPage.passwordTextBox.sendKeys(password);
    }
}
