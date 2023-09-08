package Repositories;

import Exceptions.ParkingSpotDoesntExists;
import models.ParkingSpot;

import java.util.HashMap;

public class ParkingSpotRepository {
    HashMap<Integer, ParkingSpot> parkingSpotRepo = new HashMap<>();
    public ParkingSpot get(Integer parkingSpotId)
    {
        if(parkingSpotRepo.containsKey(parkingSpotId)) {
            return parkingSpotRepo.get(parkingSpotId);
        }
        else
        {
            throw new ParkingSpotDoesntExists("parking Spot doesnt exists for given id");
        }
    }
    public void put(ParkingSpot parkingSpot)
    {
        parkingSpotRepo.put(parkingSpot.getParkingSpotId(),parkingSpot);
    }
}
