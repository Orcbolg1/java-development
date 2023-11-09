package pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        House house1 = new House();
        House house2 = new House();

        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();

        assets.add(house1);
        assets.add(house2);
        assets.add(vehicle1);
        assets.add(vehicle2);

        for(Asset asset: assets){

        }

    }
}
