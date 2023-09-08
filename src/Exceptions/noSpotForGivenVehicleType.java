package Exceptions;

public class noSpotForGivenVehicleType extends RuntimeException{
    public noSpotForGivenVehicleType(String message)
    {
        super(message);
    }
}
