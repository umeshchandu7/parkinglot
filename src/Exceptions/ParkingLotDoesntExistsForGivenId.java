package Exceptions;

public class ParkingLotDoesntExistsForGivenId extends RuntimeException{
    public ParkingLotDoesntExistsForGivenId(String message)
    {
        super(message);
    }
}
