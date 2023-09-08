package Strategies;

public class SpotAllocationFactory {
    public static SpotAllocationStrategy  getSpot()
    {
        return new  RandomSpotAllocationStrategy();

    }
}
