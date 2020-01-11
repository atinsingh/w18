import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class CartTest {

    @BeforeTest
    public void setup(){
        System.out.println("Setting up before Test from the Carttest");
    }


    @BeforeClass
    public void setupOnclass(){
        System.out.println("Setting up class " + CartTest.class.getName());
    }


}
