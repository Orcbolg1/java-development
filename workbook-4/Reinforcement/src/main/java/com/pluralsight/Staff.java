package com.pluralsight;

public class Staff {
    private String name;
    private String Position;
    private int id;

    public Staff(String name, String position, int id) {
        this.name = name;
        Position = position;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String performDuty (String dutyDescription){
        return name + " is performing duty: " + dutyDescription;
    }
}
