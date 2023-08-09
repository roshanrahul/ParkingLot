package model;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private int floorNumber;
    private List<ParkingSpot> parkingSlotsList;
    private Status status;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getParkingSlotsList() {
        return parkingSlotsList;
    }

    public void setParkingSlotsList(List<ParkingSpot> parkingSlotsList) {
        this.parkingSlotsList = parkingSlotsList;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
