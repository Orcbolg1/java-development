package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Portfolio implements Valuable {

    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public List<Valuable> getAssets() {
        return assets;
    }

    public void addAsset(Valuable asset) {
        assets.add(asset);
    }

    public void removeAsset(Valuable asset) {
        assets.remove(asset);
    }

    @Override
    public double getValue() {
        double totalValue = 0.0;
        for (Valuable asset : assets) {
            totalValue += asset.getValue();
        }
        return totalValue;
    }

    public Valuable getMostValuable() {
        if (assets.isEmpty()) {
            return null; // Return null if there are no assets
        }
        return Collections.max(assets, Comparator.comparingDouble(Valuable::getValue));
    }

    public Valuable getLeastValuable() {
        if (assets.isEmpty()) {
            return null; // Return null if there are no assets
        }
        return Collections.min(assets, Comparator.comparingDouble(Valuable::getValue));
    }
}
