package Patterns.ObserverPattern.FactoryPattern;

import Patterns.ObserverPattern.FactoryPattern.Factory.MakeProduct;
import Patterns.ObserverPattern.FactoryPattern.FactoryInterface.FactoryInterface;

public class Order {
    public static void main(String[] args){
        MakeProduct makeProduct = new MakeProduct();

        FactoryInterface shape1 = makeProduct.getProduct("CIRCLE");
        shape1.shape();

        FactoryInterface shape2 = makeProduct.getProduct("RECTANGLE");
        shape2.shape();

        FactoryInterface shape3 = makeProduct.getProduct("SQUARE");
        shape3.shape();

    }
}
