import org.testng.Assert;
import org.testng.annotations.*;

public class PaymentTest {
    static  int count= 0;
    @Test(groups = {"pageload"})
    public void tc(){
        System.out.println("Payment Test...");
    }

    @Test(groups = "pageload")
    public void tc1(){
        System.out.println("Payment Test1...");
    }

    @Test(groups = "testing")
    public void tc2(){
        System.out.println("Payment Test2...");

    }

    @Test(groups = "testing", expectedExceptions = {ArithmeticException.class})
    public void tc3() {
        System.out.println(3/0);
        System.out.println("Payment Test3...");
    }






    @BeforeClass
    public void setupOnclass(){
        System.out.println("################################################");
        System.out.println("Setting up class " + PaymentTest.class.getName());
    }
    @AfterClass
    public void AfteeOnclass(){
        System.out.println("Setting up class " + PaymentTest.class.getName());
        System.out.println("################################################");
    }
}
