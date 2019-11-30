package co.pragra.test;

import co.pragra.app.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {
    private Calculator calculator;
    static int i = 0;

    @BeforeSuite()
    public void setupApplication(){
        System.out.println("Setup in progress....");
        calculator = new Calculator();
    }

    @BeforeClass
    @Parameters({"broswer", "testname"})
    public void setUp(String broswer, String name) {
        System.out.println("Got Broswer "+ broswer);
        System.out.println("Got NAME "+ name);
        System.out.println("Running for the class Calculator Test");
    }

    @BeforeClass
    public void setUp() {
      //  System.out.println("Got this "+ data);

    }

    //    @Test(groups = {"sanity", "uat"})
//    public void sumTC1(){
//        Assert.assertEquals(calculator.sum(2,4),6,"SumTC1 Failed");
//    }

    @Test()
    @Parameters("abc")
    public void testMultipication(String test) {
        System.out.println("***** GOT IN TEST **** "+ test);
        Assert.assertEquals(calculator.multiply(3,5), 15);
    }

    @Test(dependsOnMethods = "testMultipication" , invocationCount = 5, successPercentage = 79)
    public void testDivide() throws InterruptedException {
        if(i==3 || i ==2){
            Thread.sleep(600);
            Assert.fail();
        }
        i++;
        Assert.assertEquals(calculator.divide(12,2), 6);
    }

    @Test( expectedExceptions = IllegalArgumentException.class)
    public void testDivideBy0() {
        calculator.divide(12,0);
    }

    @AfterSuite
    public void tearDown(){
        System.out.println("Destroy in progress....");
        calculator = null;
    }
}
