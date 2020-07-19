package com.bridgelabz.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
      private Object vehicle;
      List<Object> parkingLotList = new ArrayList<>();
      private int PARKING_LOT_SIZE;
      Owner owner = new Owner();

      public void park(Object vehicle) throws ParkingLotException {
            this.vehicle = vehicle;
            if (parkingLotList.size() > PARKING_LOT_SIZE)
                  owner.parkingLotFUll();
            parkingLotList.add(this.vehicle);
      }

      public void setParkingLotSize(int size) {
            this.PARKING_LOT_SIZE = size;
      }

      public boolean unPark(Object vehicle) {
            if (vehicle == null)
                  return false;
            if (this.vehicle == vehicle) {
                  this.vehicle = null;
                  return true;
            }
            return false;
      }

      public boolean isVehicleParked(Object vehicle) {
            if (this.vehicle.equals(vehicle))
                  return true;
            return false;
      }
}
