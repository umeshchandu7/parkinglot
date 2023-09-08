package models;

public class ParkingSpot {
    private int parkingSpotId;
    private Status status;
    private Vehicle vehicle;
    private int parkingFloor;
    private VehicleType vehicleType;

    public ParkingSpot(int parkingSpotId, Status status, Vehicle vehicle, int parkingFloor, VehicleType vehicleType) {
        this.parkingSpotId = parkingSpotId;
        this.status = status;
        this.vehicle = vehicle;
        this.parkingFloor = parkingFloor;
        this.vehicleType = vehicleType;
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(int parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    public ParkingSpot()
    {

    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "parkingSpotId=" + parkingSpotId +
                ", status=" + status +
                ", vehicle=" + vehicle +
                ", parkingFloor=" + parkingFloor +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
