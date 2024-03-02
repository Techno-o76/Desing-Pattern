package Patterns.ObserverPattern.FactoryPattern.Products;

import Patterns.ObserverPattern.FactoryPattern.FactoryInterface.FactoryInterface;

public class ShapeCircle implements FactoryInterface {

    @Override
    public void shape() {
        System.out.println("Circle is Produced!");
    }
}
