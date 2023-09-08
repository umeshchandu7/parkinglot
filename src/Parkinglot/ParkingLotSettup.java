package Parkinglot;

import Controller.ParkingLotController;
import Repositories.ParkingFloorRepository;
import Repositories.ParkingLotRepository;
import Repositories.ParkingSpotRepository;
import Repositories.TicketRepository;
import Services.IntialiseService;
import Services.TicketService;
import models.ParkingLot;
import models.Ticket;
import models.VehicleType;

import java.util.Scanner;

public class ParkingLotSettup {
    IntialiseService intialiseService;
    ParkingLotController parkingLotController;
    public ParkingLotSettup()
    {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        TicketRepository ticketRepository = new TicketRepository();
        this.intialiseService = new IntialiseService(parkingLotRepository,parkingSpotRepository,parkingFloorRepository);
        this.parkingLotController = new ParkingLotController(new TicketService(ticketRepository,parkingLotRepository));
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        ParkingLotSettup parkingLotSettup = new ParkingLotSettup();
        ParkingLot parkingLot = parkingLotSettup.intialiseService.intitalize(2,6);
       Ticket ticket =  parkingLotSettup.parkingLotController.getTicket("GREEN","AP2048",VehicleType.BIKE);
//         Ticket ticket = parkingLotController.getTicket("green","AP2045", VehicleType.BIKE);
         System.out.println(ticket);


    }
}
