package models;

public class Vehicle {

    private VehicleType vehicleType;
    private String vehicleNo;
    private String vehicleColor;

    public Vehicle( VehicleType vehicleType, String vehicleNo, String vehicleColor) {

        this.vehicleType = vehicleType;
        this.vehicleNo = vehicleNo;
        this.vehicleColor = vehicleColor;
    }



    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType=" + vehicleType +
                ", vehicleNo='" + vehicleNo + '\'' +
                ", vehicleColor='" + vehicleColor + '\'' +
                '}';
    }
}
