package Repositories;

import Exceptions.ParkingLotDoesntExistsForGivenId;
import models.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepository {
    HashMap<String, ParkingLot> parkingLotRepo = new HashMap<>();

    public ParkingLot get(String parkingLotId)
    {
        if(parkingLotRepo.containsKey(parkingLotId))
        {
            return parkingLotRepo.get(parkingLotId);
        }
        else
        {
            throw new ParkingLotDoesntExistsForGivenId("ParkingLot Exists for given Id");
        }
    }
    public void put(ParkingLot parkingLot)
    {
        parkingLotRepo.put(parkingLot.getParkingLotId(),parkingLot);
    }

}
