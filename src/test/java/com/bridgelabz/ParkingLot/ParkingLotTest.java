package com.bridgelabz.ParkingLot;

import org.junit.Assert;
import org.junit.Test;

public class ParkingLotTest {
      @Test
      public void givenVehicle_WhenParked_ShouldReturnTrue() {
            ParkingLot parkingLot = new ParkingLot();
            Object vehicle = new Object();
            boolean isPark = parkingLot.park(vehicle);
            Assert.assertTrue(isPark);
      }
}
