package co.pragra.b18.drivermanager;

import co.pragra.b18.config.FrameWorkConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private WebDriver driver;
    private static DriverManager instance;
    private static Logger logger = LogManager.getLogger("DriverManager");

    private DriverManager() {
        init();
    }

    private void init(){
        if(FrameWorkConfig.getProperty("browser")==null){
            logger.warn("Property Browser is not set, defaulting it to CHROME");
            System.setProperty("webdriver.chrome.driver", FrameWorkConfig.getProperty("chrome.executable"));
            driver = new ChromeDriver();
        }else
        {
            logger.info("Initializing driver for browser type {} ", FrameWorkConfig.getProperty("browser"));
            if (FrameWorkConfig.getProperty("browser").equals(BroswerType.CHROME.toString())) {
                System.setProperty("webdriver.chrome.driver", FrameWorkConfig.getProperty("chrome.executable"));
                driver = new ChromeDriver();
            } else if (FrameWorkConfig.getProperty("browser").equals(BroswerType.FIREFOX.toString())) {
                System.setProperty("webdriver.gecko.driver", FrameWorkConfig.getProperty("firefox.executable"));
                driver = new FirefoxDriver();
            }else {
                logger.warn("Browser {} doesn't match with configutation defaulting to CHROME" ,FrameWorkConfig.getProperty("browser") );
                System.setProperty("webdriver.chrome.driver", FrameWorkConfig.getProperty("chrome.executable"));
                driver = new ChromeDriver();
            }
        }


    }

    public static WebDriver getDriver(){

        if(instance ==null){
            instance = new DriverManager();
        }
        logger.info("Returning the driver instance {} ", instance.driver);
        return instance.driver;
    }
}
