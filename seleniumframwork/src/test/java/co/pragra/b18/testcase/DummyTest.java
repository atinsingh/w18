package co.pragra.b18.testcase;


import co.pragra.b18.config.FrameWorkConfig;
import co.pragra.b18.drivermanager.DriverManager;
import co.pragra.b18.listeners.ScreenshotListener;
import co.pragra.b18.util.FrameworkUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners({ScreenshotListener.class})
public class DummyTest {
    WebDriverWait wait ;
    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        driver = DriverManager.getDriver();
        wait = new WebDriverWait(driver,20);
        driver.get(FrameWorkConfig.getProperty("app.url"));
        WebElement btn= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("truste-consent-button")));
        btn.click();
    }

    @Test
    public void testName() {

    }

    @Test(dependsOnMethods = "testName")
    public void test2() {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Contact Sales"))).click();
        Assert.fail();
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
        //DriverManager.getDriver().quit();
    }
}
