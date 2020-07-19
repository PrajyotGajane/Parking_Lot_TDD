package com.bridgelabz.ParkingLot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParkingLotTest {
      Object vehicle;
      ParkingLot parkingLot;

      @Before
      public void setUp() {
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

      @Test
      public void givenVehicle_WhenAlreadyParked_ShouldReturnFalse() {
            parkingLot.park(vehicle);
            boolean alreadyParked = parkingLot.park(vehicle);
            Assert.assertFalse(alreadyParked);
      }
      @Test
      public void givenVehicle_WhenAlreadyUnParked_ShouldReturnFalse() {
            parkingLot.park(vehicle);
            parkingLot.unPark(vehicle);
            boolean alreadyUnParked = parkingLot.unPark(vehicle);
            Assert.assertFalse(alreadyUnParked);
      }
}