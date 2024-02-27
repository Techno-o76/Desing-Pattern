package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.FactoryInterface.FactoryInterface;
import AbstractFactoryPattern.FactoryInterface.LuxuaryVehicles;
import AbstractFactoryPattern.FactoryInterface.NormalVehicles;


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
