package com.pluralsight;

public class cellPhoneApplication {

    private long serialnumber = 0;
    private String model = " ";
    private String carrier = " ";
    private String phoneNumber = " ";
    private String owner = " ";


    public cellPhoneApplication(long serialnumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialnumber = serialnumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public long getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(long serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
