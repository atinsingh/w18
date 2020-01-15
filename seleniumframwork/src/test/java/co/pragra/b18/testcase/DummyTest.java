package co.pragra.b18.testcase;


import co.pragra.b18.config.FrameWorkConfig;
import co.pragra.b18.drivermanager.DriverManager;
import co.pragra.b18.util.FrameworkUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.Date;

public class DummyTest {
    WebDriver driver;
    @Test
    public void testName() {
       driver = DriverManager.getDriver();
      driver.get(FrameWorkConfig.getProperty("app.url"));
      FrameworkUtils.captureScreenShot(driver, "Login",false);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
        //DriverManager.getDriver().quit();
    }
}
