package Controller;

import Services.IntialiseService;
import Services.TicketService;
import models.ParkingLot;
import models.Ticket;
import models.VehicleType;

public class ParkingLotController {
    TicketService ticketService;

    public ParkingLotController(TicketService ticketService) {

        this.ticketService = ticketService;
    }

    public void noOfSlotsforeachFloor(ParkingLot parkingLot, VehicleType vehicleType)
    {
        ticketService.noOfSlotsForEachFloorForVehicleType(parkingLot,vehicleType);
    }
    public void noOfSlotsForGivenFloor(ParkingLot parkingLot,VehicleType vehicleType,int floorNo)
    {
        ticketService.noOfSlotsForGivenFloorforVehicleType(parkingLot,floorNo,vehicleType);
    }
    public Ticket getTicket(String vehiclecolor, String vehicleNo, VehicleType vehicleType)
    {
        return ticketService.getTicket(vehicleNo,vehiclecolor,vehicleType);
    }
}
