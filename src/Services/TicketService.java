package Services;

import Repositories.ParkingLotRepository;
import Repositories.TicketRepository;
import Strategies.SpotAllocationFactory;
import Strategies.SpotAllocationStrategy;
import models.*;

import java.time.LocalDateTime;

public class TicketService {
    TicketRepository ticketRepository;
    ParkingLotRepository parkingLotRepository;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket getTicket(String vehicleNo, String vehicleColor, VehicleType vehicleType)
    {
        SpotAllocationStrategy spotAllocationStrategy = SpotAllocationFactory.getSpot();
        ParkingLot parkingLot = this.parkingLotRepository.get("ParkingLot1");
       ParkingSpot parkingSpot =  spotAllocationStrategy.getSpot(vehicleType,parkingLot);
       String id = parkingLot.getParkingLotId()+"_"+parkingSpot.getParkingFloor()+"_"+parkingSpot.getParkingSpotId();
        Ticket ticket = new Ticket();
        ticket.setTicketId(id);
        ticket.setVehicle(new Vehicle(vehicleType,vehicleNo,vehicleColor));
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setParkingSpot(parkingSpot);
        ticketRepository.put(ticket);
        return ticket;
    }
    public void noOfSlotsForEachFloorForVehicleType(ParkingLot parkingLot, VehicleType vehicleType)
    {
        for(ParkingFloor parkingFloor : parkingLot.getFloors())
        {
            int cnt = 0;
            for(ParkingSpot parkingSpot: parkingFloor.getParkingSpots())
            {
                if(parkingSpot.getStatus().equals(Status.AVAILABLE)&&parkingSpot.getVehicleType().equals(vehicleType))
                {
                    cnt++;
                }
            }
            System.out.println("no of slots "+parkingFloor.getParkingFloorId()+" :"+cnt);
        }
    }
    public void noOfSlotsForGivenFloorforVehicleType(ParkingLot parkingLot,int floorNo, VehicleType vehicleType)
    {
        ParkingFloor parkingFloor = parkingLot.getFloors().get(floorNo);
        int cnt=0;
        for(ParkingSpot parkingSpot: parkingFloor.getParkingSpots())
        {
            if(parkingSpot.getStatus().equals(Status.AVAILABLE)&&parkingSpot.getVehicleType().equals(vehicleType))
            {
                cnt++;
            }
        }
        System.out.println("no of slots "+parkingFloor.getParkingFloorId()+" :"+cnt);
    }
    public void unPark(Ticket ticket)
    {
        ticket.getParkingSpot().setStatus(Status.AVAILABLE);
        String ticketId = ticket.getTicketId();
        ticketRepository.remove(ticketId);
    }
}
