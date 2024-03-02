package Patterns.ObserverPattern.FactoryPattern.Factory;

import Patterns.ObserverPattern.FactoryPattern.FactoryInterface.FactoryInterface;
import Patterns.ObserverPattern.FactoryPattern.Products.ShapeCircle;
import Patterns.ObserverPattern.FactoryPattern.Products.ShapeRectangle;
import Patterns.ObserverPattern.FactoryPattern.Products.ShapeSquare;

// have a has a relation ship with factory interface.
public class MakeProduct {

    public FactoryInterface getProduct(String input){
        // write business logic accoding to which are going to produce the objects
        switch (input){
            case "CIRCLE":
                return new ShapeCircle();
            case "RECTANGLE":
                return new ShapeRectangle();
            case "SQUARE":
                return new ShapeSquare();
            default:
                return null;
        }

    }

}
