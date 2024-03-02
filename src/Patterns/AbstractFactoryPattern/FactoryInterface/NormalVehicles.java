package Patterns.ObserverPattern.AbstractFactoryPattern.FactoryInterface;

import Patterns.ObserverPattern.AbstractFactoryPattern.Objects.Maruti;
import Patterns.ObserverPattern.AbstractFactoryPattern.Objects.Toyota;
import Patterns.ObserverPattern.AbstractFactoryPattern.Objects.Vehicle;

// subfactory 2, manufacture the product according to business requirment.
public class NormalVehicles implements FactoryInterface{

    public NormalVehicles(){
        System.out.println("Normal Vehicles created!");
    }

    @Override
    public Vehicle getVehicle(String vehicle) {
        switch (vehicle){
            case "Toyota":
                return new Toyota();
            case "Maruti":
                return new Maruti();
            default:
                return null;
        }
    }
}
