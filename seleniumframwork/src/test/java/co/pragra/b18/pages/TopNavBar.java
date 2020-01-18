package co.pragra.b18.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavBar {
    private WebDriver driver;
    @FindBy(css = "#black-topbar ul>li:nth-child(1)>a")
    private WebElement requestADemoLink;
    @FindBy(css = "#black-topbar ul>li:nth-child(2)>a")
    private WebElement one888Number;

    @FindBy(css = "#black-topbar ul>li:nth-child(3)>a")
    private WebElement resources;

    @FindBy(css = "#black-topbar ul>li:nth-child(4)>a")
    private WebElement support;

    @FindBy(css = "#black-topbar ul>li:nth-child(3)>ul>li:nth-child(1)>a")
    private WebElement downLoadZoom;

    public TopNavBar(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LiveDemoPage clickRequestDemo(){
        this.requestADemoLink.click();
        return new LiveDemoPage(driver);
    }

    public DownloadCenter clickDownLoad(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources).pause(2000).moveToElement(downLoadZoom).click().build().perform();
        return new DownloadCenter(driver);
    }

}
