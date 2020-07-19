package com.bridgelabz.ParkingLot;

public class Owner {
      public void parkingLotFUll() throws ParkingLotException {
            throw new ParkingLotException("Parking lot is full", ParkingLotException.ExceptionType.PARKING_LOT_FULL);
      }
}
