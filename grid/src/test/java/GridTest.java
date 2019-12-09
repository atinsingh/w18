import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {

    WebDriver driver ;

    @BeforeTest
    @Parameters({"browser", "platform"})
    public void setup(String browser, String platform) throws MalformedURLException {
        if(browser.equals("firefox")){
            FirefoxOptions options = new FirefoxOptions();
            options.setCapability("browserName","firefox");
            options.setCapability("platform", platform);
            driver = new RemoteWebDriver(new URL("http://92.168.51.107:4444/wd/hub"),options);
        }else
        if(browser.equals("internet explorer")){
            InternetExplorerOptions options = new InternetExplorerOptions();
            options.setCapability("browserName","internet explorer");
            options.setCapability("platform", platform);
            driver = new RemoteWebDriver(new URL("http://92.168.51.107:4444/wd/hub"),options);
        }else{
            ChromeOptions options = new ChromeOptions();
            options.setCapability("browserName","chrome");
            options.setCapability("platform", platform);
            driver = new RemoteWebDriver(new URL("http://92.168.51.107:4444/wd/hub"),options);
        }

    }

    @Test
    public void testHome() {
        driver.get("https://allstate.com");
    }

    @AfterMethod
    public void tearDown() {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
