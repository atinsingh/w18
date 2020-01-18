package co.pragra.b18.testcase;

import co.pragra.b18.config.FrameWorkConfig;
import co.pragra.b18.drivermanager.DriverManager;
import co.pragra.b18.pages.LiveDemoPage;
import co.pragra.b18.pages.TopNavBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TopNavigationTest {
    WebDriver driver;
    TopNavBar topNavBar;
    LiveDemoPage liveDemoPage;
    WebDriverWait wait;


    @BeforeSuite
    public void setup(){
      driver = DriverManager.getDriver();
      driver.get(FrameWorkConfig.getProperty("app.url"));
      wait = new WebDriverWait(driver,20);
        WebElement btn= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("truste-consent-button")));
        btn.click();

    }

    @Test
    public void testRequestDemo() {
        topNavBar = new TopNavBar(driver);
        liveDemoPage = topNavBar.clickRequestDemo();
        Assert.assertEquals("Request a Demo",liveDemoPage.getLiveTex().getText());

    }

    @Test
    public void testRequestDemoForm() {
        topNavBar = new TopNavBar(driver);
        liveDemoPage = topNavBar.clickRequestDemo();
        liveDemoPage
               .keyInEmail("abc@def.com")
               .keyInCompany("ABC");

    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
        //DriverManager.getDriver().quit();
    }

}
