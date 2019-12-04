package co.pragra.test;

import co.pragra.app.GuestDemo;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GuestDemoTest {
    private GuestDemo guests ;

    @BeforeSuite
    public void setUp(){
        guests = new GuestDemo();
        guests.addToGuestList("Atin");
        guests.addToGuestList("Vivek");
    }

    @Test
    public void testAdd() {
        guests.addToGuestList("Kaushik");
        Assert.assertTrue(guests.getGuests().contains("Kaushik"));
    }
}
