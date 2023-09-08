package models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String parkingLotId;
    private List<ParkingFloor> floors;
    private Status status;

    public String getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(String parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ParkingLot(String parkingLotId, List<ParkingFloor> floors, Status status) {
        this.parkingLotId = parkingLotId;
        this.floors = floors;
        this.status = status;
    }
    public ParkingLot()
    {
//       this.floors = new ArrayList<ParkingFloor>();
    }
}
