package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;
import utilities.ReusableMethods;

import java.util.List;

public class DemoGuru99StepDefinitions {

    DemoGuruPage demoGuruPage = new DemoGuruPage();

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenBaslikStr) {

        List<WebElement> basliklarWebElementListesi = demoGuruPage.basliklWebElementListesi;
        List<String> baslikStringListesi = ReusableMethods.getElementsText(basliklarWebElementListesi);

        int istenenSutunIndexi = baslikStringListesi.indexOf(istenenBaslikStr);
        List<WebElement> istenenSutunWebElementListesi = demoGuruPage.sutunListesiGetir(istenenSutunIndexi);

        //istenenSutunWebElementListesi.stream().forEach(t-> System.out.println(t.getText()));

        List<String> istenenSutunStrList = ReusableMethods.getElementsText(istenenSutunWebElementListesi);
        System.out.println(istenenBaslikStr + "Sutundaki elementler \n" + istenenSutunStrList);


    }
}
