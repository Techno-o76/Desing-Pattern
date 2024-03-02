package Patterns.ObserverPattern.AbstractFactoryPattern.Factory;

import Patterns.ObserverPattern.AbstractFactoryPattern.FactoryInterface.FactoryInterface;
import Patterns.ObserverPattern.AbstractFactoryPattern.FactoryInterface.LuxuaryVehicles;
import Patterns.ObserverPattern.AbstractFactoryPattern.FactoryInterface.NormalVehicles;


// manufacturing the products according to business requirement.
public class Factory  {

    public Factory(){
        System.out.println("Factory Created!");
    }

    public FactoryInterface getFactory(String factoryName){
        switch (factoryName){
            case "Luxuary":
                return new LuxuaryVehicles();
            case "Normal":
                return new NormalVehicles();
            default:
                return null;
        }
    }

}
