package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorStepPage {

    public EditorStepPage(){  PageFactory.initElements(Driver.getDriver(),this);   }

    @FindBy(xpath="//span[.='New']")
    public WebElement newButton;

    @FindBy(xpath="//input[@id='DTE_Field_first_name']")
    public WebElement firstNameBox;

    @FindBy(xpath="//input[@id='DTE_Field_last_name']")
    public WebElement lastNameBox;

    @FindBy(xpath="//input[@id='DTE_Field_position']")
    public WebElement possitionBox;

    @FindBy(xpath="//input[@id='DTE_Field_office']")
    public WebElement officeBox;

    @FindBy(xpath="//input[@id='DTE_Field_extn']")
    public WebElement extensionBox;

    @FindBy(xpath="//input[@id='DTE_Field_start_date']")
    public WebElement dateBox;

    @FindBy(xpath="//input[@id='DTE_Field_salary']")
    public WebElement salaryBox;

    @FindBy (xpath = "//button[.='Create']")
    public WebElement createButton;

    @FindBy(css = "[type=\"search\"]")
    public WebElement searchBox;

    @FindBy (xpath= "(//td[@class='sorting_1'])[1]")
    public WebElement searchResult;




}
