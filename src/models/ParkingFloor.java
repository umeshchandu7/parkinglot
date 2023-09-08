package models;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
   private int parkingFLoorId;
   private List<ParkingSpot> parkingSpots;

     public int getParkingFloorId() {
        return parkingFLoorId;
    }

    public void setParkingfloorId(int parkingFLoorId) {
        this.parkingFLoorId = parkingFLoorId;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingFloor(int parkingId, List<ParkingSpot> parkingSpots) {
        this.parkingFLoorId = parkingFLoorId;
        this.parkingSpots = parkingSpots;
    }
    public ParkingFloor()
    {
//      this.parkingSpots = new ArrayList<ParkingSpot>();
    }
}
