package Patterns.ObserverPattern.DecoraterPattern.DifferentTopping;

import Patterns.ObserverPattern.DecoraterPattern.BasePizza;
import Patterns.ObserverPattern.DecoraterPattern.ExtraTopping;

public class ExtraCheesTopping extends ExtraTopping {

    // constructor injection
    public ExtraCheesTopping(BasePizza basePizza){
        super(basePizza);
        System.out.println("Extra Topping of ExtraChess is Added");
    }

    @Override

    public int cost(){
        return this.basePizza.cost()+10;
    }
}
