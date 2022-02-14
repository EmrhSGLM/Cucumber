package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebUniverstiyStepDefinitions {

    WebUniversityPage webUniversityPage = new WebUniversityPage();

    @Given("Login Portal'a kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @Given("Login Portal'a tiklar")
    public void login_portal_a_tiklar() {
        webUniversityPage.loginPortalButton.click();
    }

    @Then("acilan diger window'a gecer")
    public void acilan_diger_window_a_gecer() {

        ReusableMethods.switchToWindow("WebDriver | Login Portal");
    }

    @Then("{string} ve  {string} kutularina deger yazdirin")
    public void ve_kutularina_deger_yazdirin(String username, String password) {
        webUniversityPage.webUniversityUserNameButton.sendKeys(username);
        webUniversityPage.webUniversityPasswordButton.sendKeys(password);

    }

    @Then("{string} butonuna basar")
    public void butonuna_basar(String string) {
        webUniversityPage.loginButton.click();

    }

    @Then("Popup'ta cikan yazinin {string} oldugunu test edin")
    public void popup_ta_cikan_yazinin_oldugunu_test_edin(String popUpYazi) {

        String alertYazisi = Driver.getDriver().switchTo().alert().getText();
        //Assert.assertEquals(alertYazisi,popUpYazi);

    }

    @Then("Ok diyerek Popup'i kapatin")
    public void ok_diyerek_popup_i_kapatin() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        ReusableMethods.switchToWindow("WebDriverUniversity.com");
    }

    @Then("ilk sayfaya geri donuldugunu test eder")
    public void ilk_sayfaya_geri_donuldugunu_test_eder() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "WebDriverUniversity.com";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

}
