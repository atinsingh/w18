import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class HomeTest {

    WebDriver driver;
    @BeforeSuite
    public void setup(){
        System.setProperty("webdriver.chrome.driver","/Users/atinsingh/Downloads/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://zoom.us");
    }

    @Test(enabled = false)
    public void testName() throws InterruptedException, MalformedURLException {
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Webinars"));
        Thread.sleep(1000);
        Actions actions = new Actions(driver);

        driver.findElement(By.id("truste-consent-button")).click();
        Thread.sleep(1000);
        actions.click(driver.findElement(By.linkText("Contact Sales"))).build().perform();
        System.out.println("******AFTER CLICKING ******");
        System.out.println(driver.getCurrentUrl());

//        String parent = driver.getWindowHandle();
//        Set<String> allWindows = driver.getWindowHandles();
//
//
//        for (String abc: allWindows){
//            if(!abc.equals(parent)){
//                driver.switchTo().window(abc);
//                break;
//            }
//        }
        Thread.sleep(2000);
        driver.navigate().back();

        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().to(new URL("https://pragra.co"));
        driver.close();
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getPageSource());


    }

    @Test
    public void testCookie() throws InterruptedException {
        driver.get("https://www1.oanda.com/currency/converter/");
//        WebElement elm = driver.findElement(By.id("base_currency_input")) ;
//        elm.sendKeys("INR");
//        elm.sendKeys(Keys.ENTER);

        Cookie baseCurrency = driver.manage().getCookieNamed("base_currency_0");
        driver.manage().addCookie(new Cookie("base_currency_0", "CAD"));
        driver.navigate().refresh();
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        driver.navigate().refresh();
//        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
        driver.manage().window().setSize(new Dimension(230,960));
        driver.manage().window().setPosition(new Point(1400,200));

    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(8000);
        driver.quit();
    }
}
