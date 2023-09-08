package Exceptions;

public class ParkingFloorDoesntExists extends RuntimeException{
    public ParkingFloorDoesntExists(String message)
    {
        super(message);
    }
}
