package co.pragra.b18.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LiveDemoPage {
    private WebDriver driver;

    @FindBy(css = "#support_contact>div>div>h2:first-child")
    private WebElement liveTex;

    @FindBy(id = "email")
    private WebElement emailIput;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(id = "first_name")
    private WebElement firstName;

    @FindBy(id = "last_name")
    private WebElement lastName;

    @FindBy(id = "phone")
    private WebElement phone;

    @FindBy(id = "zipcode")
    private WebElement zipCode;

    @FindBy(id = "description")
    private WebElement additionalInformation;

    @FindBy(id = "00Nd0000007MFAl")
    private WebElement employeeSelect;


    public LiveDemoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public LiveDemoPage keyInEmail(String email){
        this.emailIput.sendKeys(email);
        return this;
    }

    public LiveDemoPage keyInCompany(String company){
        this.company.sendKeys(company);
        return this;
    }


    public WebElement getLiveTex() {
        return liveTex;
    }
}
