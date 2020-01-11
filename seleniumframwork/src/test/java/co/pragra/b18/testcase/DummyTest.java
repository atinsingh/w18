package co.pragra.b18.testcase;

import co.pragra.b18.config.FrameWorkConfig;
import co.pragra.b18.drivermanager.DriverManager;
import org.testng.annotations.Test;

public class DummyTest {
    @Test
    public void testName() {
        DriverManager.getDriver().get(FrameWorkConfig.getProperty("app.url"));

    }
}
