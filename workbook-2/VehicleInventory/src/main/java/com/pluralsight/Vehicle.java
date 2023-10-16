package com.pluralsight;

public class Vehicle {
    private long vehicleId;
    private String makeOfModel;
    private String color;
    private int odometerReading;
    private float price;

    public Vehicle(long vehicleId, String makeOfModel, String color,
                   int odometerReading, float price) {
        this.vehicleId = vehicleId;
        this.makeOfModel = makeOfModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeOfModel() {
        return makeOfModel;
    }

    public void setMakeOfModel(String makeOfModel) {
        this.makeOfModel = makeOfModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", makeOfModel='" + makeOfModel + '\'' +
                ", color='" + color + '\'' +
                ", odometerReading=" + odometerReading +
                ", price=" + price +
                '}';
    }
}
