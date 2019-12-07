
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SelFirstTest {
    @BeforeSuite
    public void setUp() {
       System.setProperty("webdriver.chrome.driver", "/Users/atinsingh/Downloads/drivers/chromedriver");
    }




    @Test
    public void testOpenBroswer() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://zoom.us/contactsales");

//      WebElement emailInput =  driver.findElement(By.id("email"));
//
//      emailInput.sendKeys("atin@gmail.com");
//        System.out.println(emailInput);

//      WebElement elm = driver.findElement(By.className("page-header"));
//        System.out.println(elm.getTagName());
//        WebElement elm = driver.findElement(By.cssSelector(".page-header>h1"));
//        System.out.println(elm.getText());
//        WebElement elm = driver.findElement(By.linkText("JOIN A MEETING"));
//        elm.click();
//         WebElement elm = driver.findElement(By.partialLinkText("MEETING"));
//         elm.click();
//           WebElement elm = driver.findElement(By.name("first_name"));
//           elm.sendKeys("Atin Singh");

            //WebElement elm = driver.findElement(By.tagName("input"));
            // System.out.println(elm);



        Thread.sleep(8000);
        driver.quit();
    }
}
