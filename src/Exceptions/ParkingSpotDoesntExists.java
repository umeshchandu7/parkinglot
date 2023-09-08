package Exceptions;

import Repositories.ParkingSpotRepository;

public class ParkingSpotDoesntExists extends RuntimeException{
    public ParkingSpotDoesntExists(String message)
    {
        super(message);
    }
}
