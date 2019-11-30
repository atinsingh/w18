package co.pragra.test;

import co.pragra.app.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeSuite
    public void setupApplication(){
        System.out.println("Setup in progress....");
      calculator = new Calculator();
    }

    @Test
    public void sumTC1(){
        Assert.assertEquals(calculator.sum(2,4),6,"SumTC1 Failed");
    }

    @Test
    public void testMultipication() {
        Assert.assertEquals(calculator.multiply(3,5), 15);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(calculator.divide(12,2), 6);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivideBy0() {
        calculator.divide(12,0);
    }

    @AfterSuite
    public void tearDown(){
        System.out.println("Destroy in progress....");
        calculator = null;
    }
}
