package com.bridgelabz.ParkingLot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParkingLotTest {
      Object vehicle;
      ParkingLot parkingLot;
      @Before
      public void setUp(){
            vehicle = new Object();
            parkingLot = new ParkingLot();
      }
      @Test
      public void givenVehicle_WhenParked_ShouldReturnTrue() {
            boolean isPark = parkingLot.park(vehicle);
            Assert.assertTrue(isPark);
      }

      @Test
      public void givenVehicle_WhenUnParked_ShouldReturnTrue() {
            parkingLot.park(vehicle);
            boolean unPark = parkingLot.unPark(vehicle);
            Assert.assertTrue(unPark);
      }
}
