package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuappPage {

    public HerokuappPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Add Element']")
    public WebElement addButonElement;

    @FindBy(css = "[onclick=\"deleteElement()\"]")
    public WebElement deleteButonElement;

}
