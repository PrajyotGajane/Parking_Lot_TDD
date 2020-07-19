package com.bridgelabz.ParkingLot;

public class ParkingLotException extends Exception {
      public ExceptionType type;

      public enum ExceptionType {
            PARKING_LOT_FULL
      }

      public ParkingLotException(String message, ExceptionType type) {
            super(message);
            this.type = type;
      }
}
