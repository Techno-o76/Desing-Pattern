package Patterns.ObserverPattern.DecoraterPattern;

import Patterns.ObserverPattern.DecoraterPattern.DifferentBasePizza.FarmHouse;
import Patterns.ObserverPattern.DecoraterPattern.DifferentTopping.ExtraCheesTopping;
import Patterns.ObserverPattern.DecoraterPattern.DifferentTopping.MushroomTopping;

public class Customer {
    public static void main(String[] args){
        BasePizza farmHouse = new FarmHouse();
        System.out.println(farmHouse.cost());

        BasePizza mushroomTopping = new MushroomTopping(farmHouse);
        System.out.println(mushroomTopping.cost());

        BasePizza extraCheesTopping = new ExtraCheesTopping(mushroomTopping);
        System.out.println(extraCheesTopping.cost());
    }
}
