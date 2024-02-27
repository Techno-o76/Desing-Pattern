package AbstractFactoryPattern.FactoryInterface;

import AbstractFactoryPattern.Objects.*;


// subfactory 1, manufacture the product according to business requirement.
public class LuxuaryVehicles implements FactoryInterface {

    public LuxuaryVehicles() {
        System.out.println("Luxuary Vehicles created! ");
    }

    @Override
    public Vehicle getVehicle(String vehicle) {
        switch (vehicle){
            case "BMW":
                return new BMW();
            case "Mercedies":
                return new Mercedies();
            default:
                return null;
        }
    }
}
