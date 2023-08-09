package model;

public class Vehicle {
    private VehicleType vehicleType;
    private String make;
    private String color;
    private String number;

    public Vehicle(VehicleType vehicleType, String make, String color, String number) {
        this.vehicleType = vehicleType;
        this.make = make;
        this.color = color;
        this.number = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
