package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.FactoryInterface.FactoryInterface;
import AbstractFactoryPattern.FactoryInterface.LuxuaryVehicles;
import AbstractFactoryPattern.FactoryInterface.NormalVehicles;
import AbstractFactoryPattern.Objects.Vehicle;


// manufacturing the products according to business requirement.
public class Factory  {

    public static void main(String[] args) {
        // object of subfactories are created
        FactoryInterface vehicleType1 = new LuxuaryVehicles();
        FactoryInterface vehicleType2 = new NormalVehicles();


        // product object is created
        Vehicle bmw = vehicleType1.getVehicle("BMW");
        Vehicle toyota = vehicleType2.getVehicle("Toyota");

        bmw.drive();
        bmw.cost();

        toyota.drive();
        toyota.cost();
    }

}
