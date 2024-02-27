package AbstractFactoryPattern;

import AbstractFactoryPattern.Factory.Factory;
import AbstractFactoryPattern.FactoryInterface.FactoryInterface;
import AbstractFactoryPattern.FactoryInterface.LuxuaryVehicles;
import AbstractFactoryPattern.FactoryInterface.NormalVehicles;
import AbstractFactoryPattern.Objects.Vehicle;

public class Order {

    public static void main(String[] args) {
        // object of subfactories are created
        Factory factory = new Factory();

        FactoryInterface factory1 = factory.getFactory("Luxuary");
        FactoryInterface factory2 = factory.getFactory("Normal");



        // product object is created
        Vehicle bmw = factory1.getVehicle("BMW");
        Vehicle toyota = factory2.getVehicle("Toyota");

        bmw.drive();
        bmw.cost();

        toyota.drive();
        toyota.cost();
    }
}
