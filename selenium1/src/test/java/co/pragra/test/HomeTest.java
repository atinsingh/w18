import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeTest {
    @BeforeSuite
    public void setupOnSuiteLevel(){
        System.out.println("Setting my testing environment at suite level");
    }
    @BeforeClass
    public void setupOnclass(){
        System.out.println("Setting up class " + HomeTest.class.getName());
    }
    @Test
    public void tc(){
        System.out.println("Test case 1 - completed");
    }

    @AfterSuite
    public void tearDown(){
        System.out.println("Cleaned up on Suite Level");
    }
}
