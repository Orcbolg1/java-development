package com.pluralsight;

public class Cash extends pluralsight.Asset {
    public Cash(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);

    }

    @Override
    public double getValue() {
        return getOriginalCost();
    }
}