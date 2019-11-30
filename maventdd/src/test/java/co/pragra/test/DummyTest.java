package co.pragra.test;

import org.testng.annotations.*;

public class DummyTest {
    @BeforeSuite
    public void setUp1() {
        System.out.println("Running before Suite in class DummYtest");
    }
//    @BeforeTest
//    public void setUp2() {
//        System.out.println("Running before test");
//    }
//
//    @BeforeClass
//    public void setUp3() {
//        System.out.println("Running before class for Dummy Test");
//    }
//
//    @BeforeMethod
//    public void setUp4() {
//        System.out.println("Running before Method for Dummy Test");
//    }

    @Test(priority = 2)
    public void test1() {
        System.out.println("TC1");
    }

    @Test(priority = 4)
    public void test2() {
        System.out.println("TC2");
    }

//    @AfterSuite
//    public void tearDown() {
//        System.out.println("After Suite Dummy test");
//    }
//    @AfterTest
//    public void tearDown1() {
//        System.out.println("After Test Dummy test");
//    }
//
//    @AfterClass
//    public void tearDown2() {
//        System.out.println("After class Dummy test");
//    }
//    @AfterMethod
//    public void tearDown3() {
//        System.out.println("After class Dummy test");
//    }


}
