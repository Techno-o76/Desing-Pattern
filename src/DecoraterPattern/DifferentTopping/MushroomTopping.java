package DecoraterPattern.DifferentTopping;

import DecoraterPattern.BasePizza;
import DecoraterPattern.ExtraTopping;

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
