package Repositories;

import Exceptions.ParkingFloorDoesntExists;
import models.ParkingFloor;
import models.ParkingLot;

import java.util.HashMap;

public class ParkingFloorRepository {
    HashMap<Integer, ParkingFloor> parkingFloorRepo = new HashMap<>();
    public ParkingFloor get(Integer parkingFloorId)
    {
        if(parkingFloorRepo.containsKey(parkingFloorId))
        {
            return parkingFloorRepo.get(parkingFloorId);
        }
        else
        {
            throw new ParkingFloorDoesntExists("parkingFloorDoesnt exist for given id");
        }
    }
    public void put(ParkingFloor parkingFloor)
    {
        parkingFloorRepo.put(parkingFloor.getParkingFloorId(),parkingFloor);
    }

}
