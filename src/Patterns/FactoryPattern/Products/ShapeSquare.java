package Patterns.ObserverPattern.FactoryPattern.Products;

import Patterns.ObserverPattern.FactoryPattern.FactoryInterface.FactoryInterface;

public class ShapeSquare implements FactoryInterface {
    @Override
    public void shape() {
        System.out.println("Square is Produced!");
    }
}
