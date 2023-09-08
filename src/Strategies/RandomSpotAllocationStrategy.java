package Strategies;

import Exceptions.noSpotForGivenVehicleType;
import models.*;

public class RandomSpotAllocationStrategy implements SpotAllocationStrategy{
    public ParkingSpot getSpot(VehicleType vehicleType, ParkingLot parkingLot)
    {
        for(ParkingFloor parkingFloors : parkingLot.getFloors())
        {
            for(ParkingSpot parkingSpot: parkingFloors.getParkingSpots())
            {
                if((parkingSpot.getStatus().equals(Status.AVAILABLE))&&(parkingSpot.getVehicleType().equals(vehicleType)))
                {
                          parkingSpot.setStatus(Status.UN_AVAILABLE);
                    return parkingSpot;
                }
            }
        }
        throw new noSpotForGivenVehicleType("no spot avalible for given vehicleType");
    }
}
