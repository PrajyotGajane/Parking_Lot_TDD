package com.bridgelabz.ParkingLot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParkingLotTest {
      Object vehicle, vehicle2, vehicle3, vehicle4;
      ParkingLot parkingLot;

      @Before
      public void setUp() {
            vehicle = new Object();
            parkingLot = new ParkingLot();
            vehicle2 = new Object();
            vehicle3 = new Object();
            vehicle4 = new Object();
      }

      @Test
      public void givenVehicle_WhenParked_ShouldReturnTrue() {

            try {
                  parkingLot.park(vehicle);
                  boolean isPark = parkingLot.isVehicleParked(vehicle);
                  Assert.assertTrue(isPark);
            } catch (ParkingLotException e) {
                  e.printStackTrace();
            }

      }

      @Test
      public void givenVehicle_WhenUnParked_ShouldReturnTrue() throws ParkingLotException {
            parkingLot.park(vehicle);
            boolean unPark = parkingLot.unPark(vehicle);
            Assert.assertTrue(unPark);
      }

      @Test
      public void givenVehicle_WhenAlreadyParked_ShouldReturnFalse() {
            try {
                  parkingLot.park(vehicle);
                  parkingLot.park(vehicle);
            } catch (ParkingLotException e) {
                  Assert.assertEquals(e.type, ParkingLotException.ExceptionType.PARKING_LOT_FULL);
            }
      }

      @Test
      public void givenVehicle_WhenAlreadyUnParked_ShouldReturnFalse() throws ParkingLotException {
            parkingLot.park(vehicle);
            parkingLot.unPark(vehicle);
            boolean alreadyUnParked = parkingLot.unPark(vehicle);
            Assert.assertFalse(alreadyUnParked);
      }

      @Test
      public void givenVehicles_WhenParkingFull_ShouldThrowException() {
            parkingLot.setParkingLotSize(3);
            try {
                  parkingLot.park(vehicle);
                  parkingLot.park(vehicle2);
                  parkingLot.park(vehicle3);
                  parkingLot.park(vehicle4);
            } catch (ParkingLotException e) {
                  Assert.assertEquals(e.type, ParkingLotException.ExceptionType.PARKING_LOT_FULL);
            }
      }
}