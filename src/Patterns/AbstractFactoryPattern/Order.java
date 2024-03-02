package Patterns.ObserverPattern.AbstractFactoryPattern;

import Patterns.ObserverPattern.AbstractFactoryPattern.Factory.Factory;
import Patterns.ObserverPattern.AbstractFactoryPattern.FactoryInterface.FactoryInterface;
import Patterns.ObserverPattern.AbstractFactoryPattern.Objects.Vehicle;

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
