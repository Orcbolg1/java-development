package com.pluralsight;

public class Jewelry extends FixedAsset{

    private double karat;

    public Jewelry(String name, double value, double karat) {
        super(name, value);
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    @Override
    public double getValue(){
        return getValue();
    }
}
