package Patterns.ObserverPattern.FactoryPattern.Products;

import Patterns.ObserverPattern.FactoryPattern.FactoryInterface.FactoryInterface;

public class ShapeRectangle implements FactoryInterface {

    @Override
    public void shape() {
        System.out.println("Rectangle is Produced!");
    }
}
