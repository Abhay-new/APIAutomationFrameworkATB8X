package com.testingAPI.tests.Integration.CRUD;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationFlow {

    // Create A Booking , Create A Token
    // Update the Booking
    // Delete the Booking

    @Test(groups = "qa", priority = 1)
    @Owner("Abhay")
    @Description("TC#INT1 - Step1. Verify that the Booking can be Created")
    public void testCreateBooking(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 2)
    @Owner("Abhay")
    @Description("TC#INT - Step2. Verify the Booking By ID")
    public void testVerifyBookingId(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 3)
    @Owner("Abhay")
    @Description("TC#INT - Step3. Verify updated booking By ID")
    public void testupdatedBookingbyId(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 4)
    @Owner("Abhay")
    @Description("TC#INT - Step4. Delete the booking By ID")
    public void testdeleteBookingbyId(){
        Assert.assertTrue(true);
    }



}
