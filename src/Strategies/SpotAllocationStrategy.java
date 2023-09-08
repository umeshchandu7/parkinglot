package Strategies;

import models.ParkingLot;
import models.ParkingSpot;
import models.Ticket;
import models.VehicleType;

public interface SpotAllocationStrategy {
    public ParkingSpot getSpot(VehicleType vehicleType, ParkingLot parkingLot);

}
