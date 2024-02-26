package FactoryPattern.Products;

import FactoryPattern.FactoryInterface.FactoryInterface;

public class ShapeCircle implements FactoryInterface {

    @Override
    public void shape() {
        System.out.println("Circle is Produced!");
    }
}
