package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EditorStepPage;

public class EditorStepDefinitions {

    EditorStepPage editorStepPage = new EditorStepPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorStepPage.newButton.click();
    }

    @Then("firstname olarak {string} yazar")
    public void firstname_olarak_yazar(String firstname) {
        editorStepPage.firstNameBox.sendKeys(firstname);
    }

    @Then("lastname olarak {string} yazar")
    public void lastname_olarak_yazar(String lastname) {
        editorStepPage.lastNameBox.sendKeys(lastname);
    }
    @Then("Position olarak {string} yazar")
    public void position_olarak_yazar(String position) {
        editorStepPage.possitionBox.sendKeys(position);
    }
    @Then("Office olarak {string} yazar")
    public void office_olarak_yazar(String office) {
        editorStepPage.officeBox.sendKeys(office);
    }
    @Then("Extension olarak {string} yazar")
    public void extension_olarak_yazar(String extension) {
        editorStepPage.extensionBox.sendKeys(extension);
    }
    @Then("Start date olarak {string} yazar")
    public void start_date_olarak_yazar(String startDate) {
        editorStepPage.dateBox.sendKeys(startDate);
    }
    @Then("Salary olarak {string} yazar")
    public void salary_olarak_yazar(String salary) {
        editorStepPage.salaryBox.sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorStepPage.createButton.click();
    }
    @When("kullanici {string} ile arama yapar")
    public void kullanici_ile_arama_yapar(String search){
        editorStepPage.searchBox.sendKeys(search);

    }
    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isim_bolumunde_oldugunu_dogrular(String firstname) {
        String sonucStr = editorStepPage.searchResult.getText();
        Assert.assertTrue(sonucStr.contains(firstname));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int sure) {
        try {
            Thread.sleep(sure*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
