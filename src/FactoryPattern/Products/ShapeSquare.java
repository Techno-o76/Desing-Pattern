package FactoryPattern.Products;

import FactoryPattern.FactoryInterface.FactoryInterface;

public class ShapeSquare implements FactoryInterface {
    @Override
    public void shape() {
        System.out.println("Square is Produced!");
    }
}
