package Patterns.ObserverPattern.DecoraterPattern.DifferentTopping;

import Patterns.ObserverPattern.DecoraterPattern.BasePizza;
import Patterns.ObserverPattern.DecoraterPattern.ExtraTopping;

public class MushroomTopping extends ExtraTopping {


    // constructor injection
    public MushroomTopping(BasePizza basePizza){
        super(basePizza);
        System.out.println("Extra topping of Mushroom is added");
    }

    @Override
    public int cost(){
        return basePizza.cost()+20;
    }
}
