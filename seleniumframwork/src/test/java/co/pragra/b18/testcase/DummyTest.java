package co.pragra.b18.testcase;


import co.pragra.b18.config.FrameWorkConfig;
import co.pragra.b18.drivermanager.DriverManager;
import co.pragra.b18.listeners.CustomDriverEventListener;
import co.pragra.b18.listeners.ScreenshotListener;
import co.pragra.b18.reports.ExtentHTMLReport;
import co.pragra.b18.util.FrameworkUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners({ScreenshotListener.class})
public class DummyTest {
    WebDriverWait wait ;
    WebDriver webDriver;
    EventFiringWebDriver driver;
    ExtentTest test;

    @BeforeSuite
    public void setUp() {
        ExtentReports reports = ExtentHTMLReport.getReport();
        webDriver = DriverManager.getDriver();
        driver = new EventFiringWebDriver(webDriver);
        CustomDriverEventListener customDriverEventListener = new CustomDriverEventListener();
        driver.register(customDriverEventListener);
        wait = new WebDriverWait(driver,20);
        driver.get(FrameWorkConfig.getProperty("app.url"));
        WebElement btn= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("truste-consent-button")));
        btn.click();
        test = reports.createTest("DummyTest");
    }

    @Test
    public void testName() {
        WebElement element = driver.findElement(By.cssSelector(".solution-box:nth-child(1)>h3"));
        if(element.getText().equals("Video")){
            System.out.println("Pass");
            test.log(Status.PASS, "Matches");

        }else {
            System.out.println("Fail");
            test.log(Status.FAIL, "NOT MATCHE");
        }
    }

    @Test(dependsOnMethods = "testName", enabled = false)
    public void test2() {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Contact Sales"))).click();
        Assert.fail();
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        ExtentHTMLReport.getReport().flush();
        driver.quit();
        //DriverManager.getDriver().quit();
    }
}
