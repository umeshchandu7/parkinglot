package Services;

import Repositories.ParkingFloorRepository;
import Repositories.ParkingLotRepository;
import Repositories.ParkingSpotRepository;
import models.*;

import java.util.ArrayList;
import java.util.List;

public class IntialiseService {
    ParkingLotRepository parkingLotRepository;
    ParkingSpotRepository parkingSpotRepository;
    ParkingFloorRepository parkingFloorRepository;

    public IntialiseService(ParkingLotRepository parkingLotRepository, ParkingSpotRepository parkingSpotRepository, ParkingFloorRepository parkingFloorRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
    }
    public ParkingLot intitalize(int noOfFloors, int noOfSpots)
    {
        ParkingLot parkingLot=new ParkingLot();
        parkingLot.setParkingLotId("ParkingLot1");
        parkingLot.setStatus(Status.AVAILABLE);
        List<ParkingFloor> floors = new ArrayList<>();
        for(int i=1;i<=noOfFloors;i++)
        {

            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setParkingfloorId(i);
            List<ParkingSpot> spots = new ArrayList<>();
            for(int j=1;j<=noOfSpots;j++)
            {

                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setParkingSpotId(i*100+j);
                parkingSpot.setStatus(Status.AVAILABLE);
                parkingSpot.setParkingFloor(i);
                if(j%3==0) {
                    parkingSpot.setVehicleType(VehicleType.CAR);
                }
                else if(j%3==1)
                {
                    parkingSpot.setVehicleType(VehicleType.BIKE);
                }
                else
                {
                    parkingSpot.setVehicleType(VehicleType.TRUCK);
                }
                spots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }
            floors.add(parkingFloor);
            parkingFloor.setParkingSpots(spots);
            parkingFloorRepository.put(parkingFloor);
        }

        parkingLot.setFloors(floors);
        parkingLotRepository.put(parkingLot);
        return parkingLot;
    }
}
